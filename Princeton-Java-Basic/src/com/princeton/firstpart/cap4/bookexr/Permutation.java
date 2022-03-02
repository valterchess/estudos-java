package com.princeton.firstpart.cap4.bookexr;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        //populando o array com inteiros de um a n-1
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        //embaralhando os valores
        for (int i = 0; i < n; i++) {
            int r = (int)(Math.random() * (i+1)); // valores entre 0  e i
            int temp = a[r];
            a[r] = a[i];
            a[i] = temp;
        }

        //retorna a permutação
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        // retorna a visualização do tabuleiro
        for (int i = 0; i < n; i++){
            //System.out.print(a[i] + " "); variação
            for (int j = 0; j < n; j++) {
                if (a[j] == i) System.out.print("* ");
                else           System.out.print(". ");
            }
           /* System.out.println("");
            for (int j = 0; j < n; j++) {
                if (a[j] > a[i]) System.out.print("* ");
                else System.out.print(". ");
            } variação */
            System.out.println("");
        }
    }
}
