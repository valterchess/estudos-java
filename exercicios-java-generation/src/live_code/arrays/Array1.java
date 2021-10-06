package live_code.arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] media = new float[4];
        float somaMedia = 0, n1,n2,n3,mediaGeral;

        for (int i = 0; i < media.length;i++){
            System.out.println("\nInforme o valor da primeira nota: ");
            n1 = scan.nextFloat();
            System.out.println("\nInforme o valor da segunda nota: ");
            n2 = scan.nextFloat();
            System.out.println("\nInforme o valor da terceira nota: ");
            n3 = scan.nextFloat();
            media[i] = (n1 + n2 + n3)/3;
            System.out.printf("%nA média das notas dx alune %d é: %.2f\n",i+1,media[i]);
            somaMedia+= media[i];
        }
        mediaGeral = somaMedia / media.length;
        System.out.printf("%nA média geral de todes alunes é : %.2f", mediaGeral);
    }
}
