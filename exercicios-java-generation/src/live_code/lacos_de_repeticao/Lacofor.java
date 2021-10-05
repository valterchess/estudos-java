package live_code.lacos_de_repeticao;

import java.util.Scanner;

public class Lacofor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1,n2,n3,media,mg,somaMedia = 0;
		
		for (int i = 0; i < 4;i++) {
			System.out.println("Informe a primeira nota do aluno " + i + ":");
			n1 = scan.nextFloat();
			System.out.println("Informe a segunda nota do aluno " + i + ":");
			n2 = scan.nextFloat();
			System.out.println("Informe a terceira nota do aluno " + i + ":");
			n3 = scan.nextFloat();
			
			media = (n1 + n2 + n3) / 3;
			System.out.printf("%nA média do alune %d é: %.2f",i,media);
			somaMedia += media;
		}
		mg = somaMedia / 4;
		System.out.println("\nMédia geral: " + mg);
	}

}
