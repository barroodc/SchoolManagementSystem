package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamTypeDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamType;

import java.sql.SQLException;
import java.util.List;

public class ExamTypeDao extends AbstractMySQLDao<ExamType> implements IExamTypeDao {
    @Override
    public ExamType findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<ExamType> findAll() {
        return null;
    }

    @Override
    public ExamType update(ExamType dto) {
        return null;
    }

    @Override
    public ExamType create(ExamType dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
