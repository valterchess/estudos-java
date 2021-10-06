package live_code.arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[][] numeros = new int[2][3];
        Scanner scanner = new Scanner(System.in);

        //i = linha,j = coluna;
        for (int i = 0;i < numeros.length;i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("\nEntre com um valor.");
                numeros[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0;i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0 && numeros[i][j] != 0){
                    System.out.println("\n"+numeros[i][j]+"<-- Este número é par.");
                } else{
                    System.out.println("\n"+numeros[i][j]+"<-- Este número é impar.");
                }
            }
        }


    }
}
