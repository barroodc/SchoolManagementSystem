package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.TeacherSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public TeacherSchedule findByID(long id) {
        TeacherSchedule teacherSchedule = new TeacherSchedule();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                teacherSchedule.setTeacherScheduleID(rs.getLong("teacher_schedule_id"));
                teacherSchedule.setTeacherID(rs.getLong("teacher_id"));
                teacherSchedule.setDayOfWeek(rs.getString("day_of_week"));
                teacherSchedule.setTime(rs.getTime("time"));
                teacherSchedule.setLunchBreak(rs.getString("lunch_break"));
                teacherSchedule.setCourseTaught(rs.getString("course_taught"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return teacherSchedule;
    }

    @Override
    public List<TeacherSchedule> findAll() {
        return null;
    }

    @Override
    public TeacherSchedule update(TeacherSchedule dto) {
        TeacherSchedule teacherSchedule = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getTeacherID());
            statement.setString(2, dto.getDayOfWeek());
            statement.setTime(3, dto.getTime());
            statement.setString(4, dto.getLunchBreak());
            statement.setString(5, dto.getCourseTaught());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return teacherSchedule;
    }

    @Override
    public TeacherSchedule create(TeacherSchedule dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getTeacherScheduleID());
            statement.setLong(2, dto.getTeacherID());
            statement.setString(3, dto.getDayOfWeek());
            statement.setTime(4, dto.getTime());
            statement.setString(5, dto.getLunchBreak());
            statement.setString(6, dto.getCourseTaught());
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
