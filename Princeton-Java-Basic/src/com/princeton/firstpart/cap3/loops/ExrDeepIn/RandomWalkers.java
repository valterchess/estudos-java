package com.princeton.firstpart.cap3.loops.ExrDeepIn;

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x, y;
        int steps = 0;
        double total = 0;
        for (int i = 0; i <= trials && r != 0; i++) {
            x = 0;
            y = 0;
            while (Math.abs(x) + Math.abs(y) <= r) {
                double random = Math.random();
                if (random <= 0.25) x++;
                else if (random <= 0.5) x--;
                else if (random <= 0.75) y++;
                else if (random <= 1) y--;
                steps++;
            }
            total += (steps - 1);
            steps = 0;
        }
        double average = total / trials;
        System.out.println("average number of steps = " + average);
    }
}