package com.princeton.firstpart.cap4.bookexr;

public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] x = new int[n];
        int[] y = new int[n];
        int cellsToVisit = n * n;
        int steps = 0;
        double r;
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            x[i] = n / 2;
            y[i] = n / 2;
        }

        visited[n / 2][n / 2] = true;
        cellsToVisit--;

        while (cellsToVisit > 0){

            for (int i = 0; i < n; i++) {
                r = Math.random();
                if      (r <= .25) x[i]++;
                else if (r <= .50) x[i]--;
                else if (r <= .75) y[i]++;
                else               y[i]--;
                
                steps++;

                if (x[i] < n && y[i] < n && x[i] >= 0 && y[i] >= 0 && !visited[x[i]][y[i]]) {
                    cellsToVisit--;
                    visited[x[i]][y[i]] = true;
                }
            }
        }
        System.out.println(steps);
    }
}