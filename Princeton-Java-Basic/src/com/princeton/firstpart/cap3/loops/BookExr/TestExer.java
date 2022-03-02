package com.princeton.firstpart.cap3.loops.BookExr;

public class TestExer {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        if (a < b)
        {
            if (b < c)
            {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            }
            else System.out.println(a + " " + c + " " + b);
        }
        else System.out.println(b + " " + a + " " + c);

        int n = 123456789;
        int m = 0;
       for (int i = 0; i < 10; i++){
           m += i;
        }
        System.out.println(m);
    }
}