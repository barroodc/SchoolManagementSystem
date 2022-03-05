package com.chrisportfolio.schoolmanagementsystem;


import com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl.AdmissionsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Admissions;
import com.chrisportfolio.schoolmanagementsystem.utils.DatabaseConnectionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args){

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("127.0.0.1:3306","schoolmanagementsystem","username","the_password");
        try {
            Connection connection = dcm.getConnection();
            AdmissionsDao admissionsDao = new AdmissionsDao(connection);
            Admissions admissions = admissionsDao.findByID(1);
            LOGGER.info(admissions);
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
