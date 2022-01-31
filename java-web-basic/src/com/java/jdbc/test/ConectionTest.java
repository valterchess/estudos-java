package com.java.jdbc.test;

import com.java.jdbc.ConnectionFactory;
import java.sql.SQLException;

public class ConectionTest {
    public static void main(String[] args) throws SQLException {
        var connection = new ConnectionFactory()
                .getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
}
