package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IExamResultDao;
import com.chrisportfolio.schoolmanagementsystem.model.ExamResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    public ExamResult findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<ExamResult> findAll() {
        return null;
    }

    @Override
    public ExamResult update(ExamResult dto) {
        return null;
    }

    @Override
    public ExamResult create(ExamResult dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
