package lacos_de_decisao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		
		//Utilização do operador ternário
		double n2 = (n1 % 2 == 0) 
				? Math.sqrt(n1) 
				: Math.pow(n1, 2);
		
		System.out.printf("%nO resultado é %f.",n2);
		
		//Utilização do if/else
		/*if(n1 % 2 == 0) {
			n2 = Math.sqrt(n1);
			System.out.printf("%nO número informado é par e a sua raiz quadrada é %f.",n2);
		} else {
			n2 = Math.pow(n1, 2);
			System.out.printf("%nO número informado é impar e seu valor ao quadrado é %f.",n2);
		}*/
	}

}
