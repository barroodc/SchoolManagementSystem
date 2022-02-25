package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IGradeLevelDao;
import com.chrisportfolio.schoolmanagementsystem.model.GradeLevel;

import java.sql.SQLException;
import java.util.List;

public class GradeLevelDao extends AbstractMySQLDao<GradeLevel> implements IGradeLevelDao {
    @Override
    public GradeLevel findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<GradeLevel> findAll() {
        return null;
    }

    @Override
    public GradeLevel update(GradeLevel dto) {
        return null;
    }

    @Override
    public GradeLevel create(GradeLevel dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
