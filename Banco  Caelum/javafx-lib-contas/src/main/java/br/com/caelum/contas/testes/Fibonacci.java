package br.com.caelum.contas.testes;

public class Fibonacci {
	
	static long fibo(int n) {
		return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
	}
	
	public static void main(String[] args) {
		
		//TESTE DO PROGRAMA. IMPRIME OS 30 PRIMEIROS TERMOS
		for (int i = 0; i < 30; i++) {
			System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\n");
		}
	}

}
