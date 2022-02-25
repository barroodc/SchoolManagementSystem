package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.ITeacherScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.TeacherSchedule;

import java.sql.SQLException;
import java.util.List;

public class TeacherScheduleDao extends AbstractMySQLDao<TeacherSchedule> implements ITeacherScheduleDao {
    @Override
    public TeacherSchedule findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<TeacherSchedule> findAll() {
        return null;
    }

    @Override
    public TeacherSchedule update(TeacherSchedule dto) {
        return null;
    }

    @Override
    public TeacherSchedule create(TeacherSchedule dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
