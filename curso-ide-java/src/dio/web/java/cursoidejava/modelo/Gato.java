package dio.web.java.cursoidejava.modelo;

public class Gato {
	private String nome;
	private String cor;
	private int idade;

	/*
	 * public Gato(String nome, String cor, int idade) { this.nome = nome; this.cor
	 * = cor; this.idade = idade; }
	 */
	public Gato() {
	}

	public Gato(String nome, String cor, int idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
