package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.TeacherSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class TeacherScheduleDao extends AbstractMySQLDao<TeacherSchedule> implements ITeacherScheduleDao {

    private static final Logger LOGGER = LogManager.getLogger(TeacherScheduleDao.class);

    private static final String INSERT = "INSERT INTO teacher_schedule (teacher_schedule_id, teacher_id, day_of_week, time, " +
            "lunch_break, course_taught) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT teacher_schedule_id, teacher_id, day_of_week, time," +
            "lunch_break, course_taught FROM teacher_schedule WHERE teacher_schedule_id = ?";

    private static final String UPDATE = "UPDATE teacher_schedule SET teacher_id = ?, day_of_week = ?, time = ?, " +
            "lunch_break = ?, course_taught = ? FROM teacher_schedule WHERE teacher_schedule_id = ?";

    private static final String DELETE = "DELETE FROM teacher_schedule WHERE teacher_schedule_id = ?";


    @Override
    public TeacherSchedule findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<TeacherSchedule> findAll() {
        return null;
    }

    @Override
    public TeacherSchedule update(TeacherSchedule dto) {
        return null;
    }

    @Override
    public TeacherSchedule create(TeacherSchedule dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
