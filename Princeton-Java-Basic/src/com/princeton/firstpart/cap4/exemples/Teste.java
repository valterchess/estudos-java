package com.princeton.firstpart.cap4.exemples;

public class Teste {
    public static void main(String[] args) {

        /*int[] b = {1, 2, 3};
        int[] c =  b;
        c[0] += b[2];
        c[1] += b[1];
        c[2] += b[0];
        System.out.println(c[0] + c[1] + c[2]);*/
        int[] a = new int[10];

        for (int i = 0; i < 10; i++){
            a[i] = 9 - i;
        }
        for(int i = 0; i < 10; i++){
            a[i] = a [a[i]];
        }
        System.out.println(a[5]);
    }
}
