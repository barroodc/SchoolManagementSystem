package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IGradeLevelDao;
import com.chrisportfolio.schoolmanagementsystem.model.GradeLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GradeLevelDao extends AbstractMySQLDao<GradeLevel> implements IGradeLevelDao {

    private static final Logger LOGGER = LogManager.getLogger(GradeLevelDao.class);

    private static final String INSERT = "INSERT INTO grade_level (grade_level_id, name, description) VALUES (?, ?, ?)";

    private static final String GET_ONE = "SELECT grade_level_id, name, description FROM grade_level WHERE grade_level_id = ?";

    private static final String UPDATE = "UPDATE grade_level SET name = ?, description = ? FROM grade_level WHERE grade_level_id = ?";

    private static final String DELETE = "DELETE FROM grade_level WHERE grade_level_id = ?";


    @Override
    public GradeLevel findByID(long id) {
        GradeLevel gradeLevel = new GradeLevel();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                gradeLevel.setGradeLevelID(rs.getLong("grade_level_id"));
                gradeLevel.setName(rs.getString("name"));
                gradeLevel.setDescription(rs.getString("description"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return gradeLevel;
    }

    @Override
    public List<GradeLevel> findAll() {
        return null;
    }

    @Override
    public GradeLevel update(GradeLevel dto) {
        GradeLevel gradeLevel = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setString(1, dto.getName());
            statement.setString(2, dto.getDescription());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return gradeLevel;
    }

    @Override
    public GradeLevel create(GradeLevel dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getGradeLevelID());
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
