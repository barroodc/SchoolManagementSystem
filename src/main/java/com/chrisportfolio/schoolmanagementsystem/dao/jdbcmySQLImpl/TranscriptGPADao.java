package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptGPADao;
import com.chrisportfolio.schoolmanagementsystem.model.TranscriptGPA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    public TranscriptGPA findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<TranscriptGPA> findAll() {
        return null;
    }

    @Override
    public TranscriptGPA update(TranscriptGPA dto) {
        return null;
    }

    @Override
    public TranscriptGPA create(TranscriptGPA dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
