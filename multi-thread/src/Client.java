
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.io.PrintStream;
	import java.net.Socket;
	import java.net.UnknownHostException;
	import java.util.Scanner;

public class Client {
		public static void main(String[] args) 
				throws UnknownHostException, IOException {
			
			Socket client = new Socket("127.0.0.1", 12345);
			System.out.println("Conectado ao servidor");
			
			Scanner teclado = new Scanner(System.in);
			Scanner chat = new Scanner(client.getInputStream());
			PrintStream saida = new PrintStream(client.getOutputStream());
			
			
			
			
			OutputStream arquivo = new FileOutputStream("arquivon.txt");
			OutputStreamWriter arquivow = new OutputStreamWriter(arquivo);
			BufferedWriter bArquivo = new BufferedWriter(arquivow);
		
			PrintStream noArquivo = new PrintStream("arquivon.txt");
			
			FileInputStream lendo = new FileInputStream("arquivon.txt");
			InputStreamReader rLendo = new InputStreamReader(lendo);
			BufferedReader bLendo = new BufferedReader(rLendo);
			
			while(teclado.hasNextLine()) {
				noArquivo.println(teclado.nextLine());
				saida.println(bLendo.readLine());	
			}
			
			while(chat.hasNextLine()) {
				//saida.println(bLendo.readLine());
				System.out.println(chat);
			}
			
			noArquivo.close();
			saida.close();
			bArquivo.close();
			teclado.close();
			bLendo.close();
		}
	
	}

