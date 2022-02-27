package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.StudentSchedule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public StudentSchedule findByID(long id) {
        StudentSchedule studentSchedule = new StudentSchedule();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                studentSchedule.setStudentScheduleID(rs.getLong("student_schedule_id"));
                studentSchedule.setStudentID(rs.getLong("student_id"));
                studentSchedule.setDayOfWeek(rs.getString("day_of_week"));
                studentSchedule.setTime(rs.getTime("time"));
                studentSchedule.setLocation(rs.getString("location"));
                studentSchedule.setLunchBreak(rs.getString("lunch_break"));
                studentSchedule.setClassRoom(rs.getString("class_room"));
                studentSchedule.setCourseName(rs.getString("course_name"));
                studentSchedule.setTotalNumberOfCredits(rs.getDouble("total_number_of_credits"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return studentSchedule;
    }

    @Override
    public List<StudentSchedule> findAll() {
        return null;
    }

    @Override
    public StudentSchedule update(StudentSchedule dto) {
        StudentSchedule studentSchedule = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setString(2, dto.getDayOfWeek());
            statement.setTime(3, dto.getTime());
            statement.setString(4, dto.getLocation());
            statement.setString(5, dto.getLunchBreak());
            statement.setString(6, dto.getClassRoom());
            statement.setString(7, dto.getCourseName());
            statement.setDouble(8, dto.getTotalNumberOfCredits());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return studentSchedule;
    }

    @Override
    public StudentSchedule create(StudentSchedule dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getStudentScheduleID());
            statement.setLong(2, dto.getStudentID());
            statement.setString(3, dto.getDayOfWeek());
            statement.setTime(4, dto.getTime());
            statement.setString(5, dto.getLocation());
            statement.setString(6, dto.getLunchBreak());
            statement.setString(7, dto.getClassRoom());
            statement.setString(8, dto.getCourseName());
            statement.setDouble(9, dto.getTotalNumberOfCredits());
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
