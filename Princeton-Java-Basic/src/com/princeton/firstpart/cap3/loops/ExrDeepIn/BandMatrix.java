package com.princeton.firstpart.cap3.loops.ExrDeepIn;

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        char a = '*', b = '0';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    System.out.print(" " + a + " ");
                } else {
                    System.out.print(" " + b + " ");
                }
            }
            System.out.println();
        }
    }
}

