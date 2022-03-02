package com.princeton.firstpart.cap3.loops.BookExr;

public class PowerOfTwoWthFor {
    public static void main(String[] args) {
        int power = 1;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + power);
            power *= 2;
        }
    }
}
