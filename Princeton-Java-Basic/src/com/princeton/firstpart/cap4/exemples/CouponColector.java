package com.princeton.firstpart.cap4.exemples;

/******************************************************************************
 *  Given n distinct card types, how many random cards do you need
 *  do collect before you have (at least) one of each type?
 *  This program simulates this random process.
 ******************************************************************************/
public class CouponColector {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int cards = 0;
        int distinct = 0;

        boolean[] found = new boolean[m];

        // repeatedly choose a random card and check whether it's a new one
        while (distinct < m) {
            int r = (int) (Math.random() * m);
            cards++;
            if (!found[r]) {
                distinct++;
                found[r] = true;
            }
        }
        System.out.println(cards);
    }
}
