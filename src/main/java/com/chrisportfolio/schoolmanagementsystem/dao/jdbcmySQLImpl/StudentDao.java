package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao extends AbstractMySQLDao<Student> implements IStudentDao {

    private static final Logger LOGGER = LogManager.getLogger(StudentDao.class);

    private static final String INSERT = "INSERT INTO student (student_id, parent_id, email, password, " +
            "first_name, last_name, dob, home_phone, mobile, first_day_on_campus, grade_level, gpa, sat_score," +
            "act_score, last_login_date, last_login_ip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT student_id, parent_id, email, password," +
            "first_name, last_name, dob, home_phone, mobile, first_day_on_campus, grade_level, gpa, sat_score," +
            "act_score, last_login_date, last_login_ip FROM student WHERE student_id = ?";

    private static final String UPDATE = "UPDATE student SET parent_id = ?, email = ?, " +
            "password = ?, first_name = ?, last_name = ?, dob = ?, home_phone = ?, mobile = ?, " +
            "first_day_on_campus = ?, grade_level = ?, gpa = ?, sat_score = ?, act_score = ?," +
            "last_login_date = ?, last_login_ip = ? FROM student WHERE student_id = ?";

    private static final String DELETE = "DELETE FROM student WHERE student_id = ?";

    @Override
    public Student findByID(long id) {
        Student student = new Student();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                student.setStudentID(rs.getLong("student_id"));
                student.setParentID(rs.getLong("parent_id"));
                student.setEmail(rs.getString("email"));
                student.setPassword(rs.getString("password"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setDob(rs.getDate("dob"));
                student.setHomePhone(rs.getString("home_phone"));
                student.setMobile(rs.getString("mobile"));
                student.setFirstDayOnCampus(rs.getDate("first_day_on_campus"));
                student.setGradeLevel(rs.getString("grade_level"));
                student.setGpa(rs.getDouble("gpa"));
                student.setSatScore(rs.getInt("sat_score"));
                student.setActScore(rs.getInt("act_score"));
                student.setLastLoginDate(rs.getDate("last_login_date"));
                student.setLastLoginIP(rs.getString("last_login_ip"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student update(Student dto) {
        Student student = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getParentID());
            statement.setString(2, dto.getEmail());
            statement.setString(3, dto.getPassword());
            statement.setString(4, dto.getFirstName());
            statement.setString(5, dto.getLastName());
            statement.setDate(6, dto.getDob());
            statement.setString(7, dto.getHomePhone());
            statement.setString(8, dto.getMobile());
            statement.setDate(9, dto.getFirstDayOnCampus());
            statement.setString(10, dto.getGradeLevel());
            statement.setDouble(11, dto.getGpa());
            statement.setInt(12, dto.getSatScore());
            statement.setInt(13, dto.getActScore());
            statement.setDate(14, dto.getLastLoginDate());
            statement.setString(15, dto.getLastLoginIP());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return student;
    }

    @Override
    public Student create(Student dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getStudentID());
            statement.setLong(2, dto.getParentID());
            statement.setString(3, dto.getEmail());
            statement.setString(4, dto.getPassword());
            statement.setString(5, dto.getFirstName());
            statement.setString(6, dto.getLastName());
            statement.setDate(7, dto.getDob());
            statement.setString(8, dto.getHomePhone());
            statement.setString(9, dto.getMobile());
            statement.setDate(10, dto.getFirstDayOnCampus());
            statement.setString(11, dto.getGradeLevel());
            statement.setDouble(12, dto.getGpa());
            statement.setInt(13, dto.getSatScore());
            statement.setInt(14, dto.getActScore());
            statement.setDate(15, dto.getLastLoginDate());
            statement.setString(16, dto.getLastLoginIP());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.executeQuery();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
