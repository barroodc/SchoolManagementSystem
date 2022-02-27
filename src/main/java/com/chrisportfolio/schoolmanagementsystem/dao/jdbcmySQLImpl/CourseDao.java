package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ICourseDao;
import com.chrisportfolio.schoolmanagementsystem.model.Course;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Course findByID(long id) {
        Course course = new Course();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                course.setCourseID(rs.getLong("course_id"));
                course.setGradeLevelID(rs.getLong("grade_level"));
                course.setName(rs.getString("name"));
                course.setName(rs.getString("description"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return course;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course update(Course dto) {
        Course course = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getGradeLevelID());
            statement.setString(2, dto.getName());
            statement.setString(3, dto.getDescription());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return course;
    }

    @Override
    public Course create(Course dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getCourseID());
            statement.setLong(2, dto.getGradeLevelID());
            statement.setString(3, dto.getName());
            statement.setString(4, dto.getDescription());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
