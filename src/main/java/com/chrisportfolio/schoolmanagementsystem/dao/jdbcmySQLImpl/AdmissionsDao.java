package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAdmissionsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Admissions;

import java.sql.SQLException;
import java.util.List;

public class AdmissionsDao extends AbstractMySQLDao<Admissions> implements IAdmissionsDao {
    @Override
    public Admissions findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Admissions> findAll() {
        return null;
    }

    @Override
    public Admissions update(Admissions dto) {
        return null;
    }

    @Override
    public Admissions create(Admissions dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
