package com.princeton.firstpart.cap4.bookexr;

/******************************************************************************
 *  Compilation:  javac HugeArray.java
 *  Execution:    java HugeArray
 *
 *  Attempts to create an array of size n^4 for n = 1000.
 *
 *  This program compiles cleans.
 *  When n is 1000, it leads to the following error
 *
 *      java.lang.NegativeArraySizeException
 *
 *  because 1000^4 overflows an int and results in a negative integer.
 *
 *
 *
 *  When n is 200, it leads to the following error
 *
 *      java.lang.OutOfMemoryError: Requested array size exceeds VM limit
 *
 *
 ******************************************************************************/
public class HugeArray {
    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int[n*n*n*n];
        System.out.println(a.length);

    }
}
