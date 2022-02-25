package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ICourseDao;
import com.chrisportfolio.schoolmanagementsystem.model.Course;

import java.sql.SQLException;
import java.util.List;

public class CourseDao extends AbstractMySQLDao<Course> implements ICourseDao {
    @Override
    public Course findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course update(Course dto) {
        return null;
    }

    @Override
    public Course create(Course dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
