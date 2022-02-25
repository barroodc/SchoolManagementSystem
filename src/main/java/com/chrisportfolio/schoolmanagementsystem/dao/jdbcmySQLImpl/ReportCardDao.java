package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IReportCardDao;
import com.chrisportfolio.schoolmanagementsystem.model.ReportCard;

import java.sql.SQLException;
import java.util.List;

public class ReportCardDao extends AbstractMySQLDao<ReportCard> implements IReportCardDao {
    @Override
    public ReportCard findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<ReportCard> findAll() {
        return null;
    }

    @Override
    public ReportCard update(ReportCard dto) {
        return null;
    }

    @Override
    public ReportCard create(ReportCard dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
