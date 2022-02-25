package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IParentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Parent;

import java.sql.SQLException;
import java.util.List;

public class ParentDao extends AbstractMySQLDao<Parent> implements IParentDao {
    @Override
    public Parent findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Parent> findAll() {
        return null;
    }

    @Override
    public Parent update(Parent dto) {
        return null;
    }

    @Override
    public Parent create(Parent dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
