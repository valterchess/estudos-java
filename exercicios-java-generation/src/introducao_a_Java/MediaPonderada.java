package introducao_a_Java;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1,n2,n3,media;
		System.out.print("Informe o primeiro número: ");
		n1 = leia.nextDouble() * 2;
		System.out.print("\nInforme o segundo número: ");
		n2 = leia.nextDouble() * 3;
		System.out.print("\nInforme o terceiro número: ");
		n3 = leia.nextDouble() * 5;
		media = (n1 + n2 + n3) / (2 + 3 + 5);
		leia.close();
		System.out.printf("A Média Ponderada dos valores inseridos é: %.2f",media);
	}
}
