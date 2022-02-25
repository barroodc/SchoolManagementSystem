package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamDao;
import com.chrisportfolio.schoolmanagementsystem.model.Exam;

import java.sql.SQLException;
import java.util.List;

public class ExamDao extends AbstractMySQLDao<Exam> implements IExamDao {
    @Override
    public Exam findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Exam> findAll() {
        return null;
    }

    @Override
    public Exam update(Exam dto) {
        return null;
    }

    @Override
    public Exam create(Exam dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
