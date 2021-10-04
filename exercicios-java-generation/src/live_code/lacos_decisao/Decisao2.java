package live_code.lacos_decisao;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		int op;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opções...");
		System.out.println("\n1- Você é muito gentil!");
		System.out.println("\n2- Você é muito persistente!");
		System.out.println("\n3- Você é muito resiliente!");
		System.out.println("\n4- Você é muito dedicade!");
		System.out.println("\nDigite uma opção: ");
		op = scan.nextInt();
		switch(op){
			case 1 -> {
				System.out.println("\nVocê é muito gentil!");
			}
			case 2 -> {
				System.out.println("\nVocê é muito persistente!");
			}
			case 3 -> {
				System.out.println("\nVocê é muito resiliente!");
			}
			case 4 -> {
				System.out.println("\nVocê é muito dedicade!");
			}
			default -> {
				System.out.println("\n");
			}
		}
	}

}
