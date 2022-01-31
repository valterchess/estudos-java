package dio.web.java.cursoidejava.main;

import dio.web.java.cursoidejava.modelo.Gato;

public class ProgramaInicial {
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livro = new Livros();
		int a = 2;
		int b = 3;
		
		System.out.println("Entendendo o eclipse!" + a + b);
		System.out.println(gato);
		System.out.println(livro);
	}
}
class Livros {
	private String nome;
	private String numeroPaginas;
}
