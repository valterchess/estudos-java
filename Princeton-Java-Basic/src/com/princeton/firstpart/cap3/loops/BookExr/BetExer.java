package com.princeton.firstpart.cap3.loops.BookExr;

public class BetExer {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trial = Integer.parseInt(args[2]);

        int wins = 0;
        for (int i = 0; i < trial; i++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + trial);
    }
}
