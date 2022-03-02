package com.princeton.firstpart.cap4.arrays;
/***
 * classe com muitos problemas facilmente solucionáveis.
 */
public class DiscretDistribuition {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // m recebe o valor na posição 0 do array args
        int n = args.length; // n  recebe o tamanho do array args
        int[] array = new int[n - 1]; // O array abaixo recebe como tamanho o valor de n - 1

        //o array criado recebe os valores dos argumentos (os valores do array args)
        for(int i = 1; i < n; i++) {
            array[i - 1] = Integer.parseInt(args[i]);
        }

        int sum = 0; // a variavel soma é iniciada com o valor 0

        for (int i = 0; i < n - 1; i++){
            sum += array[i];
            int r = (int)(Math.random() * (sum - 1));
                System.out.print(r + " ");
        }
        System.out.println();
    }
}