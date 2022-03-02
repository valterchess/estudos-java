package com.princeton.firstpart.cap3.loops.BookExr;

public class Sqrt {
    public static void main(String[] args) {
        // read in the command-line argument
        double c = Double.parseDouble(args[0]);
        double epsilon = 1.0e-15; // relative error tolerance
        double t = c;             // estimate of the square root of c

        //repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon * t){
            t =  (c/t + t) / 2;
        }
        System.out.println(epsilon);
        System.out.println(t);
    }
}
