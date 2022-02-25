package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Transcripts;

import java.sql.SQLException;
import java.util.List;

public class TranscriptsDao extends AbstractMySQLDao<Transcripts> implements ITranscriptsDao {
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
