package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Transcripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TranscriptsDao extends AbstractMySQLDao<Transcripts> implements ITranscriptsDao {

    private static final Logger LOGGER = LogManager.getLogger(TranscriptsDao.class);

    private static final String INSERT = "INSERT INTO transcripts (transcripts_id, student_id, class_name, " +
            "year_or_semester, final_grade, credits) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT transcripts_id, student_id, class_name," +
            "year_or_semester, final_grade, credits FROM transcripts WHERE transcripts_id = ?";

    private static final String UPDATE = "UPDATE transcripts SET student_id = ?, class_name = ?, year_or_semester = ?, " +
            "final_grade = ?, credits = ? FROM transcripts WHERE transcripts_id = ?";

    private static final String DELETE = "DELETE FROM transcripts WHERE transcripts_id = ?";

    @Override
    public Transcripts findByID(long id) {
        Transcripts transcripts = new Transcripts();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                transcripts.setTranscriptsID(rs.getLong("transcripts_id"));
                transcripts.setStudentID(rs.getLong("student_id"));
                transcripts.setClassName(rs.getString("class_name"));
                transcripts.setYearOrSemester(rs.getString("year_or_semester"));
                transcripts.setFinalGrade(rs.getString("final_grade"));
                transcripts.setCredits(rs.getDouble("credits"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return transcripts;
    }

    @Override
    public List<Transcripts> findAll() {
        return null;
    }

    @Override
    public Transcripts update(Transcripts dto) {
        Transcripts transcripts = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setString(2, dto.getClassName());
            statement.setString(3, dto.getYearOrSemester());
            statement.setString(4, dto.getFinalGrade());
            statement.setDouble(5, dto.getCredits());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return transcripts;
    }

    @Override
    public Transcripts create(Transcripts dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getTranscriptsID());
            statement.setLong(2, dto.getStudentID());
            statement.setString(3, dto.getClassName());
            statement.setString(4, dto.getYearOrSemester());
            statement.setString(5, dto.getFinalGrade());
            statement.setDouble(6, dto.getCredits());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.executeQuery();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
