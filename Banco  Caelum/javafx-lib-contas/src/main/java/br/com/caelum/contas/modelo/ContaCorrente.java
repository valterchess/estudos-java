package br.com.caelum.contas.modelo;
// FAZER MANUTENÇÃO DOS METODOS DA CLASS CONTA

public class ContaCorrente extends ContaTributavel {
	
	
	

	public String getTipo() {
		return "Conta Corrente";
	}
		
	public void deposita(double valor) {
		if (valor < 10) {
			throw new IllegalArgumentException("Valor mínimo para deposito é de 10 R$");
		} else { 
			this.saldo += valor;
			System.out.println("O valor de:" + valor + "R$ Foi depositado");
		}
		
	}
	
	public double getValorImposto() {
		return 42 + this.saldo * 0.01;
	}
	
	public void atualiza(double taxaSelic) {
		this.saldo += taxaSelic;
	}
	
	public void saca(double valor) {
		if (valor < 5) {
			throw new IllegalArgumentException("O valor mínimo para saques é de 5R$");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente," + "tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	
	}
	
	public void transfere(double valor, Conta conta) {
		if (valor < 10) {
		throw new IllegalArgumentException("O valor mínimo para tranferência é de 10 R$");
		}
		if (this.saldo < valor) {
		throw new SaldoInsuficienteException("Saldo insuficiente");
	}else {
		saca(valor);
		conta.deposita(valor);
	
	}
		
	}
	
}

