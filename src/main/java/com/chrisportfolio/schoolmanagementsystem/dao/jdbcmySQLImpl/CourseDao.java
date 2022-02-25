package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ICourseDao;
import com.chrisportfolio.schoolmanagementsystem.model.Course;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class CourseDao extends AbstractMySQLDao<Course> implements ICourseDao {

    private static final Logger LOGGER = LogManager.getLogger(CourseDao.class);

    private static final String INSERT = "INSERT INTO course (course_id, grade_level_id, name, " +
            "description) VALUES (?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT course_id, grade_level_id, name," +
            "description FROM course WHERE course_id = ?";

    private static final String UPDATE = "UPDATE course SET grade_level_id = ?, name = ?, description = ? FROM course WHERE course_id = ?";


    private static final String DELETE = "DELETE FROM course WHERE course_id = ?";

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
