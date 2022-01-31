/**
 *Class responsavel por moldar as contas do banco 
 * @author Valter Silva
 *
 */
package br.com.caelum.contas.model;
public class Conta {

	private double saldo;
	private String titular;
	private static int numero;
	private static final String AGENCIA = "0001";

	public double getSaldo() {

		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}
	/**
	 * Metodo que incrementa o saldo.
	 * @param valor
	 * 
	 */

	public boolean deposita(double valor) {
		if (valor < 10) {
			System.out.println("O valor minimo para deposito e de 10 R$");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			System.out.println("saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void setAgencia(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setnumero(int i) {
		// TODO Auto-generated method stub
		
	}

}
