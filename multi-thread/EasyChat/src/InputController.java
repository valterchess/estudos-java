import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class InputController implements Runnable {

	private static long classClientId = 0L;
	Socket client;
	InputController(Socket client) {
		this.client = client;
	}

	public static long getClassClientId() {
		return classClientId;
	}


	@Override
	public void run() {
		System.out.println("Novo cliente: "
				+ client
				.getInetAddress()
				.getHostAddress());
		classClientId ++;

		try {
			Scanner entrada = new Scanner(client.getInputStream());
			PrintStream recebido = new PrintStream("ServerData.txt");


			while (entrada.hasNextLine()) {
				recebido.println(entrada.nextLine());
			}

			entrada.close();
			recebido.close();

		} catch (IOException e) {
			System.out.println("Falha no fluxo de dados." + e);
		}
	}
}
