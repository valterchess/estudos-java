package com.princeton.firstpart.cap3.loops.BookExr;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i  = 0;
        int powerOfTwo = 1;

        while (i <= n){
            System.out.println(i + " " + powerOfTwo);
            powerOfTwo *= 2;
            i++;
        }
    }
}
