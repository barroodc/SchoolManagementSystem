package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IHomeworkDao;
import com.chrisportfolio.schoolmanagementsystem.model.Homework;
import com.mysql.cj.protocol.Resultset;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HomeworkDao extends AbstractMySQLDao<Homework> implements IHomeworkDao {

    private static final Logger LOGGER = LogManager.getLogger(HomeworkDao.class);

    private static final String INSERT = "INSERT INTO homework (homework_id, student_id, subject, assigned_date, " +
            "due_date, mark, grade, teacher_name, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT homework_id, student_id, subject, assigned_date," +
            "due_date, mark, grade, teacher_name, description FROM homework WHERE homework_id = ?";

    private static final String UPDATE = "UPDATE homework SET student_id = ?, subject = ?, assigned_date = ?, " +
            "due_date = ?, mark = ?, grade = ?, teacher_name = ?, description = ? FROM homework WHERE homework_id = ?";

    private static final String DELETE = "DELETE FROM homework WHERE homework_id = ?";

    @Override
    public Homework findByID(long id) {
        Homework homework = new Homework();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                homework.setHomeworkID(rs.getLong("homework_id"));
                homework.setStudentID(rs.getLong("student_id"));
                homework.setSubject(rs.getString("subject"));
                homework.setAssignedDate(rs.getDate("assigned_date"));
                homework.setDueDate(rs.getDate("due_date"));
                homework.setMark(rs.getDouble("mark"));
                homework.setGrade(rs.getString("grade"));
                homework.setTeacherName(rs.getString("teacher_name"));
                homework.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return homework;
    }

    @Override
    public List<Homework> findAll() {
        return null;
    }

    @Override
    public Homework update(Homework dto) {
        Homework homework = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setString(2, dto.getSubject());
            statement.setDate(3, dto.getAssignedDate());
            statement.setDate(4, dto.getDueDate());
            statement.setDouble(5, dto.getMark());
            statement.setString(6, dto.getGrade());
            statement.setString(7, dto.getTeacherName());
            statement.setString(8, dto.getDescription());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return homework;
    }

    @Override
    public Homework create(Homework dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getHomeworkID());
            statement.setLong(2, dto.getStudentID());
            statement.setString(3, dto.getSubject());
            statement.setDate(4, dto.getAssignedDate());
            statement.setDate(5, dto.getDueDate());
            statement.setDouble(6, dto.getMark());
            statement.setString(7, dto.getGrade());
            statement.setString(8, dto.getTeacherName());
            statement.setString(9, dto.getDescription());
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
