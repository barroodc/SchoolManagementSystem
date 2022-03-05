package com.chrisportfolio.schoolmanagementsystem.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host, String databaseName, String user, String password) {
        this.url = "jdbc:mysql://127.0.0.1:3306/schoolmanagementsystem";
        this.properties = new Properties();
        this.properties.setProperty("root", "username");
        this.properties.setProperty("password","the_password");
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
}
