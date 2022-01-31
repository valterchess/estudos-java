import exception.AccessException;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);

		String file = FileConfig.createFile("ServerData");

		try	{
			while (true) {
				Socket client = server.accept();
				Thread NewClient = new Thread(new InputController (client));
				NewClient.start();
				Scanner teclado = new Scanner(System.in);
				while (teclado.hasNext()){
					client.getOutputStream();
				}
			}
		} catch (AccessException ex){
			System.out.println("acesso negado." + ex);
		}
	}
}
