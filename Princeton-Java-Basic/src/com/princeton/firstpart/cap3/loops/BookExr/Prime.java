package com.princeton.firstpart.cap3.loops.BookExr;

public class Prime {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        boolean isPrime = true;
        if (n < 2) isPrime = false;

        for (long factor = 2; factor*factor <= n; factor++){
            if (n % factor == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(n +"is prime");
        else    System.out.println(n + "is not prime");
    }
}
