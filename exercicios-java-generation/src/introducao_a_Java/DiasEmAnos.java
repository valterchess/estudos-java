package introducao_a_Java;

import java.util.Scanner;

public class DiasEmAnos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias, anos, meses;
		System.out.println("Informe a sua idade em dias: ");
		dias = leia.nextInt();
		leia.close();
		meses = dias / 30;
		anos = meses / 12;
		System.out.printf("A sua idade em anos é: %d.", anos);
		System.out.printf("A sua idade em meses é: %d.", meses);
		System.out.printf("A sua idade em dias é: %d.", dias);
	}

}
