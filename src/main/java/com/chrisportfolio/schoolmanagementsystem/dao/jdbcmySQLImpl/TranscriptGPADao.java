package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptGPADao;
import com.chrisportfolio.schoolmanagementsystem.model.TranscriptGPA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TranscriptGPADao extends AbstractMySQLDao<TranscriptGPA> implements ITranscriptGPADao {

    private static final Logger LOGGER = LogManager.getLogger(TranscriptGPA.class);

    private static final String INSERT = "INSERT INTO transcript_gpa (transcript_gpa_id, transcripts_id, total_credits_earned, " +
            "gpa) VALUES (?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT transcript_gpa_id, transcripts_id, total_credits_earned," +
            "gpa FROM transcript_gpa WHERE transcript_gpa_id = ?";

    private static final String UPDATE = "UPDATE transcript_gpa SET transcripts_id = ?, total_credits_earned = ?, " +
            "gpa = ? FROM transcript_gpa WHERE transcript_gpa_id = ?";


    private static final String DELETE = "DELETE FROM transcript_gpa WHERE transcript_gpa_id = ?";

    @Override
    public TranscriptGPA findByID(long id) {
        TranscriptGPA transcriptGPA = new TranscriptGPA();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                transcriptGPA.setTranscriptGPAID(rs.getLong("transcript_gpa_id"));
                transcriptGPA.setTranscriptsID(rs.getLong("transcripts_id"));
                transcriptGPA.setTotalCreditsEarned(rs.getDouble("total_credits_earned"));
                transcriptGPA.setGPA(rs.getDouble("gpa"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return transcriptGPA;
    }

    @Override
    public List<TranscriptGPA> findAll() {
        return null;
    }

    @Override
    public TranscriptGPA update(TranscriptGPA dto) {
        TranscriptGPA transcriptGPA = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getTranscriptsID());
            statement.setDouble(2, dto.getTotalCreditsEarned());
            statement.setDouble(3, dto.getGPA());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return transcriptGPA;
    }

    @Override
    public TranscriptGPA create(TranscriptGPA dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getTranscriptGPAID());
            statement.setLong(2, dto.getTranscriptsID());
            statement.setDouble(3, dto.getTotalCreditsEarned());
            statement.setDouble(4, dto.getGPA());
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
