package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
	private double saldo;
	private String titular;
	private String agencia;
	private int numero;
	
	

	public String getTipo() {
		return "Conta poupança";
	}
	
	@Override
	public void setTitular(String titular) {
		this.titular = titular;		
	}
	
	@Override
	public void setAgencia(String string) {
		this.agencia = string;
	}
	
	@Override
	public void setNumero(int int1) {
		this.numero = int1;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
		
	}

	@Override
	public void deposita(double valor) {
		if (valor < 5) {
			throw new IllegalArgumentException("O valor mínimo para deposito e transferências é de 5R$");
		} else { 
			this.saldo += valor;		
		}	
	}

	@Override
	public void saca(double valor) {
		if (valor < 5) {
			throw new IllegalArgumentException("O valor mínimo para saques é de 5 R$");
		}
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente, tente um valor menor.");
		} else {
			this.saldo -= valor;
		}
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += taxaSelic;
		
	}

	@Override
	public void transfere(double valor, Conta conta) {
		if (valor < 5) {
			throw new IllegalArgumentException("O valor mínimo para saques é de 5 R$");
		}
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente, tente outro valor");
		} else {
			conta.deposita(valor);
		}	
			
	}

}
