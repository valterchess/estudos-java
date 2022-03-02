import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class NewClient implements Runnable  {
	
	Socket client;
	private static long  id = 0;
	
	public NewClient(Socket client) {
		this.client = client;
		NewClient.id += 1;
	}

	@Override
	public void run() {
		
		System.out.println("Nova conexão com o cliente: " + getId() + " " + 
	client.getInetAddress().getHostAddress());
		
		
		try {
			Scanner entrada = new Scanner(client.getInputStream());
			PrintStream recebido = new PrintStream("DataCli.txt");
			PrintStream chat = new PrintStream(client.getOutputStream());
			
			while (entrada.hasNextLine()){
				recebido.println("cliente: " + getId() + " " + entrada.nextLine());
			}
			
			while (entrada.hasNextLine()) {
				chat.println("cliente: " + getId() + " " + entrada.nextLine());
			}
			
			entrada.close();
			recebido.close();
			chat.close();
		} catch (IOException e) {
			System.out.println("Falha ao enviar os dados" + e);
		}	
	}
	
	 /*public static String protocoloDeConexao() {	 
			return "Conectado ao servido com o Id: " + getId();
		}*/
	 
	private static long getId() {
		return id;
	}

}