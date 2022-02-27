package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IGradeLevelDao;
import com.chrisportfolio.schoolmanagementsystem.model.GradeLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class GradeLevelDao extends AbstractMySQLDao<GradeLevel> implements IGradeLevelDao {

    private static final Logger LOGGER = LogManager.getLogger(GradeLevelDao.class);

    private static final String INSERT = "INSERT INTO grade_level (grade_level_id, name, description) VALUES (?, ?, ?)";

    private static final String GET_ONE = "SELECT grade_level_id, name, description FROM grade_level WHERE grade_level_id = ?";

    private static final String UPDATE = "UPDATE grade_level SET name = ?, description = ? FROM grade_level WHERE grade_level_id = ?";

    private static final String DELETE = "DELETE FROM grade_level WHERE grade_level_id = ?";


    @Override
    public GradeLevel findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<GradeLevel> findAll() {
        return null;
    }

    @Override
    public GradeLevel update(GradeLevel dto) {
        return null;
    }

    @Override
    public GradeLevel create(GradeLevel dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
