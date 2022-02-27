package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IHomeworkDao;
import com.chrisportfolio.schoolmanagementsystem.model.Homework;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    public Homework findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Homework> findAll() {
        return null;
    }

    @Override
    public Homework update(Homework dto) {
        return null;
    }

    @Override
    public Homework create(Homework dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
