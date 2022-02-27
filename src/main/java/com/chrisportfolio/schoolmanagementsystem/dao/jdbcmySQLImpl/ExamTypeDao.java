package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamTypeDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ExamTypeDao extends AbstractMySQLDao<ExamType> implements IExamTypeDao {

    private static final Logger LOGGER = LogManager.getLogger(ExamTypeDao.class);

    private static final String INSERT = "INSERT INTO exam_type (exam_type_id, name, description) VALUES (?, ?, ?)";

    private static final String GET_ONE = "SELECT exam_type_id, name, description FROM classroom WHERE exam_type_id = ?";

    private static final String UPDATE = "UPDATE exam_type SET name = ?, description = ? FROM exam_type WHERE exam_type_id = ?";

    private static final String DELETE = "DELETE FROM exam_type WHERE exam_type_id = ?";

    @Override
    public ExamType findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<ExamType> findAll() {
        return null;
    }

    @Override
    public ExamType update(ExamType dto) {
        return null;
    }

    @Override
    public ExamType create(ExamType dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
