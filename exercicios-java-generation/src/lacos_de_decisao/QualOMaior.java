package lacos_de_decisao;

import java.util.Scanner;

public class QualOMaior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Informe um valor: ");
		n1 = scan.nextInt();
		
		System.out.println("Informe outro número: ");
		n2 = scan.nextInt();
		
		System.out.println("Mais um número por gentileza: ");
		n3 = scan.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("%nO maior número digitado foi %d.",n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.printf("%nO maior número digitado foi %d.",n2);
		}else if(n3 > n2 && n3 > n1){
			System.out.printf("%nO maior número digitado foi %d.",n3);
		} else {
			System.out.println("\nVocê digitou números repetidos.");
		}
	}

}
