package com.princeton.firstpart.cap2.p2;

public class Stats5 {

    public static void main(String[] args) {
        int n = 5;
        var x1 = Math.random();
        var x2 = Math.random();
        var x3 = Math.random();
        var x4 = Math.random();
        var x5 = Math.random();

        //print 5 values
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

        var min = Math.min(x1,Math.min(x2
                ,Math.min(x3, Math.min(x4,x5))));

        var max = Math.max(x1, Math.max(x2
                ,Math.max(x3, Math.max(x4,x5))));

        double average = (x1 + x2 + x3 + x4 + x5) / n;

        //print stats
        System.out.println(" Average = " + average);
        System.out.println("Min      = " + min);
        System.out.println("Max      = " + max);
    }
}
