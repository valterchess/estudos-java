package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas  = new ArrayList<>();
	
	void adiciona(Conta c) {
		contas.add(c);
	}
	
	Conta pega(int x){
		return contas.get(x);
	}

	int PegaQuantidadeDeContas(){
		return contas.size();
	}
	
	/*Conta buscaPorTitular(String nome) { 
		
	}*/
}
	
