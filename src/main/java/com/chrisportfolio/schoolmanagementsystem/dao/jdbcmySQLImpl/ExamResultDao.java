package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamResultDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ExamResultDao extends AbstractMySQLDao<ExamResult> implements IExamResultDao {

    private static final Logger LOGGER = LogManager.getLogger(ExamResultDao.class);

    private static final String INSERT = "INSERT INTO exam_result (exam_result_id, exam_id, course_id, " +
            "student_id, mark, grade) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT exam_result_id, exam_id, course_id," +
            "student_id, mark, grade FROM exam_result WHERE exam_result_id = ?";

    private static final String UPDATE = "UPDATE exam_result SET exam_id = ?, course_id = ?, student_id = ?, " +
            "mark = ?, grade = ? FROM exam_result WHERE exam_result_id = ?";

    private static final String DELETE = "DELETE FROM exam_result WHERE exam_result_id = ?";

    @Override
    public ExamResult findByID(long id) {
        ExamResult examResult = new ExamResult();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                examResult.setExamResultID(rs.getLong("exam_result_id"));
                examResult.setExamID(rs.getLong("exam_id"));
                examResult.setCourseID(rs.getLong("course_id"));
                examResult.setStudentID(rs.getLong("student_id"));
                examResult.setMark(rs.getDouble("mark"));
                examResult.setGrade(rs.getString("grade"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return examResult;
    }

    @Override
    public List<ExamResult> findAll() {
        return null;
    }

    @Override
    public ExamResult update(ExamResult dto) {
        ExamResult examResult = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getExamID());
            statement.setLong(2, dto.getCourseID());
            statement.setLong(3, dto.getStudentID());
            statement.setDouble(4, dto.getMark());
            statement.setString(5, dto.getGrade());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return examResult;
    }

    @Override
    public ExamResult create(ExamResult dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getExamResultID());
            statement.setLong(2, dto.getExamID());
            statement.setLong(3, dto.getCourseID());
            statement.setLong(4, dto.getStudentID());
            statement.setDouble(5, dto.getMark());
            statement.setString(6, dto.getGrade());
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
