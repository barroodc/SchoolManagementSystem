package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentDao extends AbstractMySQLDao<Student> implements IStudentDao {
    @Override
    public Student findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student update(Student dto) {
        return null;
    }

    @Override
    public Student create(Student dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
