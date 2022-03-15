package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamDao;
import com.chrisportfolio.schoolmanagementsystem.model.Exam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ExamDao extends AbstractMySQLDao<Exam> implements IExamDao {

    private static final Logger LOGGER = LogManager.getLogger(ExamDao.class);

    private static final String INSERT = "INSERT INTO exam (exam_id, exam_type_id, subjects, " +
            "term, class_name) VALUES (?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT exam_id, exam_type_id, subjects," +
            "term, class_name FROM exam WHERE exam_id = ?";

    private static final String UPDATE = "UPDATE exam SET exam_type_id = ?, subjects = ?, " +
            "term = ? FROM exam WHERE exam_id = ?";

    private static final String DELETE = "DELETE FROM exam WHERE exam_id = ?";

    @Override
    public Exam findByID(long id) {
        Exam exam = new Exam();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                exam.setExamID(rs.getLong("exam_id"));
                exam.setExamTypeID(rs.getLong("exam_type_id"));
                exam.setSubjects(rs.getString("subjects"));
                exam.setTerm(rs.getString("term"));
                exam.setClassName(rs.getString("class_name"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return exam;
    }

    @Override
    public List<Exam> findAll() {
        return null;
    }

    @Override
    public Exam update(Exam dto) {
        Exam exam = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getExamTypeID());
            statement.setString(2, dto.getSubjects());
            statement.setString(3, dto.getTerm());
            statement.setString(4, dto.getClassName());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return exam;
    }

    @Override
    public Exam create(Exam dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getExamID());
            statement.setLong(2, dto.getExamTypeID());
            statement.setString(3, dto.getSubjects());
            statement.setString(4, dto.getTerm());
            statement.setString(5, dto.getClassName());
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
