package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherDao;
import com.chrisportfolio.schoolmanagementsystem.model.Teacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
