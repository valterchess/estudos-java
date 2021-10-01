package introducao_a_Java;

import java.util.Scanner;

public class DiasEmAnos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias, anos, meses,dia;
		System.out.println("Informe a sua idade em dias: ");
		dias = leia.nextInt();
		leia.close();
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		System.out.printf("Você tem : %d anos, %d meses e %d dias de vida.", anos, meses, dia);
	}

}
