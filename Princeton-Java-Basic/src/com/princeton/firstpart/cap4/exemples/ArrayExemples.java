package com.princeton.firstpart.cap4.exemples;

public class ArrayExemples {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // initialize to random values between 0 and 1
        double[] a = new double[n];
        for (int i = 0; i < n; i++){
            a[i] = Math.random();
        }

        // print array values, one per one
        System.out.println("a[]");
        System.out.println("----------------------");
        for (int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println("a = " + a);
        System.out.println();

        // find the maximum
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++){
            if (a[i] > max) max = a[i];
        }
        System.out.println("max = " + max);

        //  average
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += a[i];
        }
        System.out.println("average = " + sum / n);

        // copy to another array
        double[] b = new double[n];
        for (int i = 0; i < n; i++){
            b[i] = a[i];
        }

        for (int i = 0; i < n/2; i++){
            double temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }

        // print array values, one per line
        System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++){
            System.out.println(b[i]);
        }
        System.out.println();

        // dot product of a[] and b[]
        double dotProduct = 0.0;
        for (int i = 0; i < n; i++){
            dotProduct += a[i] * b[i];
        }
        System.out.println("dot product of a[] and b[] = " + dotProduct);
    }
}
