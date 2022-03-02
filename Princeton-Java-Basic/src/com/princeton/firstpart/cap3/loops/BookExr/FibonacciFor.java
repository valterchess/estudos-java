package com.princeton.firstpart.cap3.loops.BookExr;

public class FibonacciFor {
    public static void main(String[] args) {
        long f = 0, g = 1;
        for (long i = 0; i < 1000l; i ++){
            System.out.println(f);
            f += g;
            g = f - g;
        }
    }
}
