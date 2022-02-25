package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAttendanceDao;
import com.chrisportfolio.schoolmanagementsystem.model.Attendance;

import java.sql.SQLException;
import java.util.List;

public class AttendanceDao extends AbstractMySQLDao<Attendance> implements IAttendanceDao {
    @Override
    public Attendance findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Attendance> findAll() {
        return null;
    }

    @Override
    public Attendance update(Attendance dto) {
        return null;
    }

    @Override
    public Attendance create(Attendance dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
