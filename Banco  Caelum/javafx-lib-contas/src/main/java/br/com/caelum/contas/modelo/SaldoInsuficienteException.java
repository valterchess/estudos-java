package br.com.caelum.contas.modelo;


public class SaldoInsuficienteException extends RuntimeException{

	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
