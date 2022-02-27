package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IClassroomDao;
import com.chrisportfolio.schoolmanagementsystem.model.Classroom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Classroom findByID(long id)  {
        Classroom classroom = new Classroom();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                classroom.setClassroomID(rs.getLong("classroom_id"));
                classroom.setTeacherID(rs.getLong("teacher_id"));
                classroom.setGradeLevelID(rs.getLong("grade_level_id"));
                classroom.setTeacherScheduleID(rs.getLong("teacher_schedule_id"));
                classroom.setSection(rs.getString("section"));
                classroom.setRemarks(rs.getString("remarks"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return classroom;
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
