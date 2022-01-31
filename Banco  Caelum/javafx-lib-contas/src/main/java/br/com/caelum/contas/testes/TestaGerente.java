package br.com.caelum.contas.testes;

import br.com.caelum.contas.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		gerente.setSalario(5000);
		gerente.setSenha(1234);
		System.out.println(gerente.getBonificacao());
	}

}
