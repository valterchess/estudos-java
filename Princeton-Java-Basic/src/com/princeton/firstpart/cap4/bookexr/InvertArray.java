package com.princeton.firstpart.cap4.bookexr;

public class InvertArray {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++){
            a[i] = i;
            System.out.print(a[i]);
        }
        int n = a.length;
        for (int i = 0; i < n / 2; i++){
            int temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }

    }
}
