package lacos_de_repeticao;

import java.util.Scanner;

public class AteDigitar0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int soma = 0;
		System.out.println("para encerrar o programa digite 0, quando solicitado.");
		System.out.println("Informe um valor:");
		numero = scan.nextInt();
		soma += numero;
		do {
			System.out.println("para encerrar o programa digite 0, quando solicitado.");
			System.out.print("Informe um valor: ");
			numero = scan.nextInt();
			soma += numero;
		} while (numero != 0);
		System.out.printf("A soma total dos valores inseridos é: %d.",soma);
	}

}
