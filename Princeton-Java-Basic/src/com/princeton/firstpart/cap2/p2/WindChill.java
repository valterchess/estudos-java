package com.princeton.firstpart.cap2.p2;

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v,0.16);
    if (t > 50 || v > 120 || v < 3) {
        System.out.println("given this values, the formula is not valid");
    }
        System.out.println("given the temperature " + t
                + " (in Fahrenheit) and the wind speed " + v
                + " (in miles per hour), the wind chill is = " + w );
    }
}
