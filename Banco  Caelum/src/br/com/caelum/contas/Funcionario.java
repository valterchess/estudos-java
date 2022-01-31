package br.com.caelum.contas;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean autenticaCpf(String cpf) {
		(this.cpf == cpf) ? return true : System.out.println("Acesso negado!cpf invalido. Vai se foder malandro.");
			return false;
		}
	}
}
