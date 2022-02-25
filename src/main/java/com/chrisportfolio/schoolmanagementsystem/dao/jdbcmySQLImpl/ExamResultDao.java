package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamResultDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamResult;

import java.sql.SQLException;
import java.util.List;

public class ExamResultDao extends AbstractMySQLDao<ExamResult> implements IExamResultDao {
    @Override
    public ExamResult findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<ExamResult> findAll() {
        return null;
    }

    @Override
    public ExamResult update(ExamResult dto) {
        return null;
    }

    @Override
    public ExamResult create(ExamResult dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
