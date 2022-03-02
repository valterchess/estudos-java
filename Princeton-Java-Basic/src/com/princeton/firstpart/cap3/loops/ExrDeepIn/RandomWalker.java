package com.princeton.firstpart.cap3.loops.ExrDeepIn;

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0, y = 0;

        while (Math.abs(x) + Math.abs(y) <= r && r != 0) {
            double random = Math.random();

                steps++;
            System.out.println("(" + x + ", " + y + ")");

            if (random < 0.25) x++;
            else if (random < 0.5) x--;
            else if (random < 0.75) y--;
            else if (random <= 1) y++;
        }
        System.out.println("steps = " + (steps - 1));
    }
}