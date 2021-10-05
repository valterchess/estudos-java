package lacos_de_repeticao;

import java.util.Scanner;

public class Pesquisa {
	//exercício 4
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sair = "";
		int cont = 0;
		//dados de entradas
		int idade;
		//1-femenino 2-masculino 3-outros
		int sexo;
		//1-calma 2-nervosa 3-agressiva
		int temperamento;
		
		//dados de saida 
		int totalCalmos = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervosasAcima40 = 0;
		int calmasMenor18 = 0;
		
		while(cont < 150) {
			System.out.println("informe a idade do participante: ");
			idade = scan.nextInt();
			
			System.out.println("escolha um número para a opção do sexo: ");
			System.out.println("1-femenino\n2-masculino\n3-outros");
			sexo = scan.nextInt();
			if(sexo != 1 || sexo != 2 || sexo != 3) {
				sexo = 3;
			}

			System.out.println("escolha um número correspondente a um temperamento: ");
			System.out.println("1-calma\n2-nervosa\n3-agressiva");
			temperamento = scan.nextInt();
			
			if(temperamento == 1) {
				totalCalmos++;
			}
			if(sexo == 1 && temperamento == 2) {
				mulheresNervosas++;
			} else if (sexo == 2 && temperamento == 3) {
				homensAgressivos++;
			} else if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}
			
			if (temperamento == 2 && idade >=40) {
				nervosasAcima40++;
			}else if (temperamento == 1 && idade <=18) {
				calmasMenor18++;
			}
			cont++;
		}
		System.out.printf("\nTotal de pessoas calmas: %d",totalCalmos);
		System.out.printf("\nTotal de mulheres nervosas: %d",mulheresNervosas);
		System.out.printf("\nTotal de homens agressivos: %d",homensAgressivos);
		System.out.printf("\nTotal de outros calmos: %d",outrosCalmos);
		System.out.printf("\nTotal de pessoas nervosas com mais de 40 anos: %d",nervosasAcima40);
		System.out.printf("\nTotal de menores de 18 anos calmos: %d",calmasMenor18);
	}
}
