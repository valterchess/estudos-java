package com.princeton.firstpart.cap2.p2;

import java.util.Random;

public class SpringSeason {
    public static void main(String[] args) {
        int d = new Random().nextInt(30);
        int m = new Random().nextInt(12);
        if (d == 0){ d += 1; }
        if (m == 0){ m += 1; }
        boolean spring = (d == 20 && m == 3 || d == 20 && m == 6);
        
        var data = String.format("%d/%d\n",d,m);
        System.out.println(data + spring);
    }
}
