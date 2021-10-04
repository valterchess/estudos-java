package lacos_de_decisao;

import java.util.Scanner;

public class CategoriaPorIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a idade do participante: ");
		int idade = scan.nextInt();
		
		if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto.");
		} else if(idade >=15 && idade < 18) {
			System.out.println("Categoria Juvenil.");
		} else if(idade >=10 && idade < 15) {
			System.out.println("Categoria infantil.");
		}
		
	}

}
