package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamDao;
import com.chrisportfolio.schoolmanagementsystem.model.Exam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ExamDao extends AbstractMySQLDao<Exam> implements IExamDao {

    private static final Logger LOGGER = LogManager.getLogger(ExamDao.class);

    private static final String INSERT = "INSERT INTO exam (exam_id, exam_type_id, subjects, " +
            "marks, grades, term, class_name) VALUES (?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT exam_id, exam_type_id, subjects," +
            "marks, grades, term, class_name FROM exam WHERE exam_id = ?";

    private static final String UPDATE = "UPDATE exam SET exam_type_id = ?, subjects = ?, marks = ?, " +
            "grades = ?, term = ? FROM exam WHERE exam_id = ?";

    private static final String DELETE = "DELETE FROM exam WHERE exam_id = ?";

    @Override
    public Exam findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Exam> findAll() {
        return null;
    }

    @Override
    public Exam update(Exam dto) {
        return null;
    }

    @Override
    public Exam create(Exam dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
