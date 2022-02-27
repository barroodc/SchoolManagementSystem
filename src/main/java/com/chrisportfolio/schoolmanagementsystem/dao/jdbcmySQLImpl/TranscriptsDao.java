package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptsDao;
import com.chrisportfolio.schoolmanagementsystem.model.TranscriptGPA;
import com.chrisportfolio.schoolmanagementsystem.model.Transcripts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    public Transcripts findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Transcripts> findAll() {
        return null;
    }

    @Override
    public Transcripts update(Transcripts dto) {
        return null;
    }

    @Override
    public Transcripts create(Transcripts dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
