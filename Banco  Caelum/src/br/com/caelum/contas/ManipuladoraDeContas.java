package br.com.caelum.contas;

import br.com.caelum.contas.model.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladoraDeContas {
	
	public void criaConta(Evento evento) {
		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setnumero(56789);
		conta.setTitular("Batman");
	}

}
