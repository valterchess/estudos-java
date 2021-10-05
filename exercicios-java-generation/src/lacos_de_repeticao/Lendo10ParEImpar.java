package lacos_de_repeticao;

import java.util.Scanner;

public class Lendo10ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int par = 0;
		int impar = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.printf("você informou %d números pares"
				+ ",%n e %d números impares",par,impar);
	}

}
