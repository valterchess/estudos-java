package introducao_a_Java;

import java.util.Scanner;

public class EventoEmFabrica {

	public static void main(String[] args) {
		int totalSeg, min, horas, segs;
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe o periodo de duração do evento em segundos: ");
		totalSeg = leia.nextInt();
		min = (totalSeg % 3600) / 60;
		horas = totalSeg / 3600;
		segs = (totalSeg % 3600) % 60;
		leia.close();
		System.out.printf("O perido de duração é de: %d:%d:%d",horas, min, segs);
	}

}
