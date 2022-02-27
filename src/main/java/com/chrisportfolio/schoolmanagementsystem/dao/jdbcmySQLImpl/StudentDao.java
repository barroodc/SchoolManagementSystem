package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private static final String UPDATE = "UPDATE student SET student_id = ?, parent_id = ?, email = ?, " +
            "password = ?, first_name = ?, last_name = ?, dob = ?, home_phone = ?, mobile = ?, " +
            "first_day_on_campus = ?, grade_level = ?, gpa = ?, sat_score = ?, act_score = ?," +
            "last_login_date = ?, last_login_ip = ? FROM student WHERE student_id = ?";

    private static final String DELETE = "DELETE FROM student WHERE student_id = ?";

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
