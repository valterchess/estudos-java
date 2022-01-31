package br.com.caelum.contas.modelo;

public abstract class Conta 
		implements Comparable<Conta>{
	
	protected double saldo;
	protected String titular;
	protected String agencia;
	protected int numero;
	
	@Override
	public String toString(){
return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + "]";	
	} 
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero &&
			this.agencia.equals(outraConta.agencia);
			
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setAgencia(String string) {
		this.agencia = string;
	}
	
	public void setNumero(int int1) {
		this.numero = int1;
	}
		
	public double getSaldo() {
		return this.saldo;
	} 
	
	public  String getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
		
	
	/* DEVE CONTER UMA EXCEPTION LIMITANDO O VALOR MINIMO PARA DEPOSITO 
	 * DE 10R$ E STRINGS ESPECIFICANDO O RESULTADO DA AÇAO*/
	public void deposita(double valor) {
		if (valor < 10) {
			throw new IllegalArgumentException("Valor mínimo para deposito é de 10 R$");
		} else { 
			this.saldo += valor;
			System.out.println("O valor de:" + valor + "R$ Foi depositado");
		}
		
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
	
	
	public void atualiza(double taxaSelic) {
		this.saldo += taxaSelic;
	}
	
	public void transfere(double valor, Conta conta) {
		if (valor < 5) {
		throw new IllegalArgumentException("O valor mínimo para tranferência é de 5 R$");
		}
		if (this.saldo < valor) {
		throw new SaldoInsuficienteException("Saldo insuficiente");
	}else {
		conta.deposita(valor);
	}
	
	}
	public int compareTo(Conta outraConta) {
			return this.titular.compareTo(outraConta.titular);	
	}

	public abstract String getTipo();

}
