package br.com.caelum.contas.testes;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.SaldoInsuficienteException;

public class TestaEx {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(10);
	
		try {
			cc.saca(100);
		}catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}
