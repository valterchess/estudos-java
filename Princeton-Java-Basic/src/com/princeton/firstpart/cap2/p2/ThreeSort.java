package com.princeton.firstpart.cap2.p2;

public class ThreeSort {
    public static void main(String[] args) {
        var n1 = Integer.parseInt(args[0]);
        var n2 = Integer.parseInt(args[1]);
        var n3 = Integer.parseInt(args[2]);

        var min = Math.min(n1, Math.min(n2,n3));
        var max = Math.max(n1, Math.max(n2,n3));
        int med = n1 + n2 + n3 - min - max;

        var values = String.format("%d\n%d\n%d", min, med, max);
        System.out.println(values);
    }
}
