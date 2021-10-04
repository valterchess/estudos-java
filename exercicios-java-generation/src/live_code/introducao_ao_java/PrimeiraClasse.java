package live_code.introducao_ao_java;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
			float n1,n2,n3,media;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Informe o valor da nota 1: ");
			n1 =  leia.nextFloat();
			System.out.println("Informe o valor da nota 2: ");
			n2 =  leia.nextFloat();
			System.out.println("Informe o valor da nota 3: ");
			n3 =  leia.nextFloat();
			media = (n1 + n2 + n3) / 3;
			
			System.out.printf("A média dos valores é: %.2f",media);
			
	}

}
