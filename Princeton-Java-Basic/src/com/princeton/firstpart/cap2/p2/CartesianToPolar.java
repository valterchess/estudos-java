package com.princeton.firstpart.cap2.p2;

public class CartesianToPolar {
    public static void main(String[] args) {
        var x = Double.parseDouble(args[0]);
        var y = Double.parseDouble(args[1]);

        var r = Math.sqrt(x*x + y*y);
        var theta = Math.atan2(y,x);

        System.out.println("r     = " + r);
        System.out.println("theta = " + x);
    }
}
