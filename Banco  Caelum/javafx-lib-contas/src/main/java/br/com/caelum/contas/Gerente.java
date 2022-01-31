package br.com.caelum.contas;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		} else {
			return true;
		}
	}


	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}


	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
}

