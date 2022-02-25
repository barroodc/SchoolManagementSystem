package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IClassroomDao;
import com.chrisportfolio.schoolmanagementsystem.model.Classroom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ClassroomDao extends AbstractMySQLDao<Classroom> implements IClassroomDao {

    private static final Logger LOGGER = LogManager.getLogger(ClassroomDao.class);

    private static final String INSERT = "INSERT INTO classroom (classroom_id, teacher_id, grade_level_id, " +
            "teacher_schedule_id, section, remarks) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT classroom_id, teacher_id, grade_level_id," +
            "teacher_schedule_id, section, remarks FROM classroom WHERE classroom_id = ?";

    private static final String UPDATE = "UPDATE classroom SET teacher_id = ?, grade_level_id = ?, teacher_schedule_id = ?, " +
            "section = ?, remarks = ? FROM classroom WHERE classroom_id = ?";

    private static final String DELETE = "DELETE FROM classroom WHERE classroom_id = ?";

    @Override
    public Classroom findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Classroom> findAll() {
        return null;
    }

    @Override
    public Classroom update(Classroom dto) {
        return null;
    }

    @Override
    public Classroom create(Classroom dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
