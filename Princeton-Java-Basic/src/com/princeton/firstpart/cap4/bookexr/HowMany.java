package com.princeton.firstpart.cap4.bookexr;

import javax.swing.*;

public class HowMany {
    public static void main(String[] args) {
        int n = args.length;

        System.out.print("You entered " + n + " command-line arguments");
        if (n == 1) System.out.println(".");
        else        System.out.println("s.");
    }
}
