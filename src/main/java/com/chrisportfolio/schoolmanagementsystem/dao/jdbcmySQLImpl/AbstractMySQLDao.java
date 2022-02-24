package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IBaseDao;

import java.sql.Connection;

public abstract class AbstractMySQLDao<T> implements IBaseDao<T> {
    protected Connection connection;

    public AbstractMySQLDao(Connection connection) {
        this.connection = connection;
    }

    public AbstractMySQLDao() {

    }
}
