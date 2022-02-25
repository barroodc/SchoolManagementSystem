package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITranscriptGPADao;
import com.chrisportfolio.schoolmanagementsystem.model.TranscriptGPA;

import java.sql.SQLException;
import java.util.List;

public class TranscriptGPADao extends AbstractMySQLDao<TranscriptGPA> implements ITranscriptGPADao {
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
