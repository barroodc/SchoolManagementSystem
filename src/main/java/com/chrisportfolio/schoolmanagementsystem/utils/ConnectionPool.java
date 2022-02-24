package com.chrisportfolio.schoolmanagementsystem.utils;


import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionPool {

    private static final String DB_USERNAME= "username";
    private static final String DB_PASSWORD="password";
    private static final String DB_URL ="url";
    private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";

    private static Properties properties = null;
    private static BasicDataSource dataSource;

    static{
        try {
            properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/db.properties"));

            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
            dataSource.setUrl(properties.getProperty(DB_URL));
            dataSource.setUsername(properties.getProperty(DB_USERNAME));
            dataSource.setPassword(properties.getProperty(DB_PASSWORD));

            dataSource.setMinIdle(100);
            dataSource.setMaxIdle(1000);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
