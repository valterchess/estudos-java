package com.princeton.firstpart.cap3.loops.BookExr;

public class AllEquals {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println((a == b && b == c) ? "all equals" : "not all equals");
    }
}
