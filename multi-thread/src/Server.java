import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
			ServerSocket server1 = new ServerSocket(12345);
				System.out.println("Porta 12345 aberta!");

			OutputStream arquivo = new FileOutputStream("DataCli.txt");
			OutputStreamWriter arquivow = new OutputStreamWriter(arquivo);
			BufferedWriter bArquivo = new BufferedWriter(arquivow);
			bArquivo.close();
		
		while (true) {
			Socket client = server1.accept();	
			Thread newClient = new Thread (new NewClient(client));
			newClient.start();	
		}
	}
}

