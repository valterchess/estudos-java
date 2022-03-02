package com.princeton.firstpart.cap2.p2;

public class IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int  b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;
        String calculos = String.format("%d + %d = %d\n" +
                        "%d * %d = %d\n" +
                        "%d / %d = %d\n" +
                        "%d %s %d = %d\n" +
                        "%d = %d * %d + %d", a,b,sum
                ,a,b,prod
                ,a,b,quot
                ,a," % ",b,rem
                ,a,quot,b,rem);
        System.out.println(calculos);
    }
}
