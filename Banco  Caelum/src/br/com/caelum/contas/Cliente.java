/** Organizar a classe removendo metodos getters e setters desnecessarios,
 *  construir metodos fortes, robustos e objetivos.
 * 
 * @author valter
 *
 */
package br.com.caelum.contas;

public class Cliente {
	private String nome;
	private String cpf;
	private double saldo;
	private int senha;
	//criar uma classe agencia (construtor estatic)
	private String agencia;
	//criar um construtor para o numero da conta
	private int numeroDaConta;
	//construir if
	private double limite;
	//criar classe data 
	private String dataDeAbertura;
	//criar autenticacao de email
	private String email;
	//criar classe endreço
	private String endereco;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
