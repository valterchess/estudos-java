package com.princeton.firstpart.cap3.loops.BookExr;

public class RulerN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // ruler of order 0
        String ruler = " ";

        //repeat n times
        for (int i = 1; i <= n; i++) {

            //concatenate a ruler of order 0, the number i, and a ruler of order 0
            ruler = ruler + i + ruler;

            System.out.println(ruler);
        }
    }
}
