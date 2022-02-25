package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IClassroomDao;
import com.chrisportfolio.schoolmanagementsystem.model.Classroom;

import java.sql.SQLException;
import java.util.List;

public class ClassroomDao extends AbstractMySQLDao<Classroom> implements IClassroomDao {
    @Override
    public Classroom findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Classroom> findAll() {
        return null;
    }

    @Override
    public Classroom update(Classroom dto) {
        return null;
    }

    @Override
    public Classroom create(Classroom dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
