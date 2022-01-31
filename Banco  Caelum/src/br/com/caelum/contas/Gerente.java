package br.com.caelum.contas;

public class Gerente extends Funcionario {
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	} 
	
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	
	public double getBonificacao(){
		return (this.salario * 0.10) + 1000;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

}
