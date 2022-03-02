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

public class Cliente {
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		Scanner teclado = new Scanner(System.in);
	
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		OutputStream arquivo = new FileOutputStream("arquivox.txt");
		OutputStreamWriter arquivow = new OutputStreamWriter(arquivo);
		BufferedWriter bArquivo = new BufferedWriter(arquivow);
	
		PrintStream noArquivo = new PrintStream("arquivox.txt");
		
		FileInputStream lendo = new FileInputStream("arquivox.txt");
		InputStreamReader rLendo = new InputStreamReader(lendo);
		BufferedReader bLendo = new BufferedReader(rLendo);
		
		
		while(teclado.hasNextLine()) {
			noArquivo.println(teclado.nextLine());
			saida.println(bLendo.readLine());
		}
		
		noArquivo.close();
		saida.close();
		bArquivo.close();
		teclado.close();
		bLendo.close();
	}
}
