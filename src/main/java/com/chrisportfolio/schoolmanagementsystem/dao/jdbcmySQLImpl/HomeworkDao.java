package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IHomeworkDao;
import com.chrisportfolio.schoolmanagementsystem.model.Homework;

import java.sql.SQLException;
import java.util.List;

public class HomeworkDao extends AbstractMySQLDao<Homework> implements IHomeworkDao {
    @Override
    public Homework findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Homework> findAll() {
        return null;
    }

    @Override
    public Homework update(Homework dto) {
        return null;
    }

    @Override
    public Homework create(Homework dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
