package com.princeton.firstpart.cap4.bookexr;

public class Viajante{
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
			
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];

		int cellsToVisit = n * n * n;
		long steps = 0L;
		int revisitando = 0;
		int morte = 0;
		double random;
		boolean[][][] universe = new boolean[n][n][n];

		universe[n / 2][n / 2][n / 2] = true;
		cellsToVisit--;

		while(cellsToVisit > 0){
			for(int i = 0; i < n; i++){
				random = Math.random();
				if 		(random <= .16) x[i]++;
				else if (random <= .33) x[i]--;
				else if (random <= .49) y[i]++;
				else if (random <= .65) y[i]--;
				else if (random <= .81) z[i]++;
				else 					z[i]--;
				
				steps++;
				if(x[i] < 0 && y[i] < 0 && z[i] < 0){
					morte++;
					System.out.println("Morte");
				}
				else{
					morte++;
					System.out.println("morte");
				}
				if (x[i] < n && y[i] < n && z[i] < n && x[i] >= 0 && y[i] >= 0 && z[i] >=0 && !universe[x[i]][y[i]][z[i]]) {
					cellsToVisit--;
					universe[x[i]][y[i]][z[i]] = true;

				}
			}
			System.out.println(steps);
		}
		System.out.println("número de lugares revisitados" + revisitando);
		System.out.println("total de mortes: " + morte);
	}
}