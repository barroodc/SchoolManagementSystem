package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherDao;
import com.chrisportfolio.schoolmanagementsystem.model.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherDao extends AbstractMySQLDao<Teacher> implements ITeacherDao {

    private static final Logger LOGGER = LogManager.getLogger(TeacherDao.class);

    private static final String INSERT = "INSERT INTO teacher (teacher_id, email, password, first_name, " +
            "last_name, dob, subject, home_phone, mobile, tenured, last_login_date, last_login_ip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT teacher_id, email, password, first_name," +
            "last_name, dob, subject, home_phone, mobile, tenured, last_login_date, last_login_ip FROM teacher WHERE teacher_id = ?";

    private static final String UPDATE = "UPDATE teacher SET email = ?, password = ?, first_name = ?, " +
            "last_name = ?, dob = ?, subject = ?, home_phone = ?, mobile = ?, tenured = ?," +
            "last_login_date = ?, last_login_ip = ? FROM teacher WHERE teacher_id = ?";

    private static final String DELETE = "DELETE FROM teacher WHERE teacher_id = ?";

    @Override
    public Teacher findByID(long id) {
        Teacher teacher = new Teacher();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                teacher.setTeacherID(rs.getLong("teacher_id"));
                teacher.setEmail(rs.getString("email"));
                teacher.setPassword(rs.getString("password"));
                teacher.setFirstName(rs.getString("first_name"));
                teacher.setLastName(rs.getString("last_name"));
                teacher.setDob(rs.getDate("dob"));
                teacher.setSubject(rs.getString("subject"));
                teacher.setHomePhone(rs.getString("home_phone"));
                teacher.setMobile(rs.getString("mobile"));
                teacher.setTenured(rs.getShort("tenured"));
                teacher.setLastLoginDate(rs.getDate("last_login_date"));
                teacher.setLastLoginIP(rs.getString("last_login_ip"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return teacher;
    }

    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public Teacher update(Teacher dto) {
        Teacher teacher = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setString(1, dto.getEmail());
            statement.setString(2, dto.getPassword());
            statement.setString(3, dto.getFirstName());
            statement.setString(4, dto.getLastName());
            statement.setDate(5, dto.getDob());
            statement.setString(6, dto.getSubject());
            statement.setString(7, dto.getHomePhone());
            statement.setString(8, dto.getMobile());
            statement.setShort(9, dto.getTenured());
            statement.setDate(10, dto.getLastLoginDate());
            statement.setString(11, dto.getLastLoginIP());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return teacher;
    }

    @Override
    public Teacher create(Teacher dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getTeacherID());
            statement.setString(2, dto.getEmail());
            statement.setString(3, dto.getPassword());
            statement.setString(4, dto.getFirstName());
            statement.setString(5, dto.getLastName());
            statement.setDate(6, dto.getDob());
            statement.setString(7, dto.getSubject());
            statement.setString(8, dto.getHomePhone());
            statement.setString(9, dto.getMobile());
            statement.setShort(10, dto.getTenured());
            statement.setDate(11, dto.getLastLoginDate());
            statement.setString(12, dto.getLastLoginIP());
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
