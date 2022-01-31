package br.com.caelum.contas.testes;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintStream ps = new PrintStream("/home/valter/teste/arquivo.txt");
		do {ps.println(scan.nextLine());} 
		while (scan.hasNextLine());//InputStream is = System.in;
		//InputStream is = new FileInputStream("/home/valter/teste/arquivo.txt");
		/*InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader (isr);
		String s = br.readLine();
		
		
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();*/		
	}
}