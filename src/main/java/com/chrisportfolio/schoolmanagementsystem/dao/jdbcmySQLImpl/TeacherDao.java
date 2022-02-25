package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherDao;
import com.chrisportfolio.schoolmanagementsystem.model.Teacher;

import java.sql.SQLException;
import java.util.List;

public class TeacherDao extends AbstractMySQLDao<Teacher> implements ITeacherDao {
    @Override
    public Teacher findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public Teacher update(Teacher dto) {
        return null;
    }

    @Override
    public Teacher create(Teacher dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
