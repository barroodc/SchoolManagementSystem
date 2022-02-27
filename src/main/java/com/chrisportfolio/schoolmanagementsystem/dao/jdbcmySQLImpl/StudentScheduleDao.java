package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.StudentSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class StudentScheduleDao extends AbstractMySQLDao<StudentSchedule> implements IStudentScheduleDao {

    private static final Logger LOGGER = LogManager.getLogger(StudentScheduleDao.class);

    private static final String INSERT = "INSERT INTO student_schedule (student_schedule_id, student_id, day_of_week, time, " +
            "location, lunch_break, class_room, course_name, total_number_of_credits) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT student_schedule_id, student_id, day_of_week, time," +
            "location, lunch_break, class_room, course_name, total_number_of_credits FROM student_schedule WHERE student_schedule_id = ?";

    private static final String UPDATE = "UPDATE student_schedule SET student_id = ?, day_of_week = ?, time = ?, " +
            "location = ?, lunch_break = ?, class_room = ?, course_name = ?, total_number_of_credits = ? " +
            "FROM student_schedule WHERE student_schedule_id = ?";

    private static final String DELETE = "DELETE FROM student_schedule WHERE student_schedule_id = ?";

    @Override
    public StudentSchedule findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<StudentSchedule> findAll() {
        return null;
    }

    @Override
    public StudentSchedule update(StudentSchedule dto) {
        return null;
    }

    @Override
    public StudentSchedule create(StudentSchedule dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
