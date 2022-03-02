package com.princeton.firstpart.cap2.p2;

public class DayOfWeek {
    public static void main(String[] args) {
        var m = Integer.parseInt(args[0]);
        var d = Integer.parseInt(args[1]);
        var y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println(d0);

    }
}
