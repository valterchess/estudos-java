package com.princeton.firstpart.cap4.exemples;

/******************************************************************************
 *  This program takes two command-line arguments m and n
 *  and produces a random sample of m of the integers from 0 to n-1.
 ******************************************************************************/

public class Sample {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] perm = new int[n];
        for (int i = 0; i < n; i++)
            perm[i] = i;

        //create random sample in perm[0], perm[1],..., perm[m-1]
        for(int i = 0; i < m; i++){
            //random integer between i and n-1
            int r = i + (int) (Math.random() * (n-i));

            //swap elements at indices i and r
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        //print results
        for (int i = 0; i < n; i++){
            System.out.printf("%d ",perm[i]);
            System.out.println();
        }
    }
}
