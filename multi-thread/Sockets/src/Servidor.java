
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o clinte " +
		cliente.getInetAddress().getHostAddress());
		
		Scanner entrada = new Scanner(cliente.getInputStream());
		
		OutputStream arquivo = new FileOutputStream("recebido.txt");
		OutputStreamWriter arquivow = new OutputStreamWriter(arquivo);
		BufferedWriter bArquivo = new BufferedWriter(arquivow);
		
		
		PrintStream recebido = new PrintStream("recebido.txt");
		
		while (entrada.hasNextLine()) {
			recebido.println(entrada.nextLine());
		}
		
		bArquivo.close();
		entrada.close();
		servidor.close();
		recebido.close();	
	}
}