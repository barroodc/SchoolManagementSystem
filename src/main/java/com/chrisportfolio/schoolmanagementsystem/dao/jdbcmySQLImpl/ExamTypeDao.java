package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamTypeDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ExamTypeDao extends AbstractMySQLDao<ExamType> implements IExamTypeDao {

    private static final Logger LOGGER = LogManager.getLogger(ExamTypeDao.class);

    private static final String INSERT = "INSERT INTO exam_type (exam_type_id, name, description) VALUES (?, ?, ?)";

    private static final String GET_ONE = "SELECT exam_type_id, name, description FROM classroom WHERE exam_type_id = ?";

    private static final String UPDATE = "UPDATE exam_type SET name = ?, description = ? FROM exam_type WHERE exam_type_id = ?";

    private static final String DELETE = "DELETE FROM exam_type WHERE exam_type_id = ?";

    @Override
    public ExamType findByID(long id) {
        ExamType examType = new ExamType();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                examType.setExamTypeID(rs.getLong("exam_type_id"));
                examType.setName(rs.getString("name"));
                examType.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return examType;
    }

    @Override
    public List<ExamType> findAll() {
        return null;
    }

    @Override
    public ExamType update(ExamType dto) {
        ExamType examType = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setString(1, dto.getName());
            statement.setString(2, dto.getDescription());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return examType;
    }

    @Override
    public ExamType create(ExamType dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getExamTypeID());
            statement.setString(2, dto.getName());
            statement.setString(3, dto.getDescription());
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
