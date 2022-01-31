package br.com.caelum.contas;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.5 + 700;
	}
	
	public void setSenha(int senha) {
		 this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

}
