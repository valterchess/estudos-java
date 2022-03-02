package br.com.caelum.jdbc.teste;

import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConenexao {
	public static void main(String[] args) throws SQLException {
		var connection = new ConnectionFactory().getConnction();
		System.out.println("Conexão aberta!");
		connection.close();
	}

}
