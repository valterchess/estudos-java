package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21"
                    + "?createDatabaseIfNotExist=true"
                            + "&serverTimezone=UTC",
                    "root","9D1e5u3$");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
