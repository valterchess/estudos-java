package arrays;

import java.util.Scanner;

public class ExercArr3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int total = 0;

        //construindo a matriz e verificando o total de valores maiores que 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("\nEntre com um número inteiro: ");
                matriz[i][j] = scan.nextInt();
                if (matriz[i][j] > 10){
                    total++;
                }
            }
        }
        System.out.printf("\nNa matriz existem %d números maiores que 10.",total);
    }
}