package com.princeton.firstpart.cap2.p2;

public class SumOfSines {
    public static void main(String[] args) {
        double t = Math.toRadians(Math.random());
        double sum = (Math.sin(2*t) + Math.sin(3*t));
        System.out.println(sum);
    }
}
