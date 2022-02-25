package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IStudentScheduleDao;
import com.chrisportfolio.schoolmanagementsystem.model.StudentSchedule;

import java.sql.SQLException;
import java.util.List;

public class StudentScheduleDao extends AbstractMySQLDao<StudentSchedule> implements IStudentScheduleDao {
    @Override
    public StudentSchedule findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<StudentSchedule> findAll() {
        return null;
    }

    @Override
    public StudentSchedule update(StudentSchedule dto) {
        return null;
    }

    @Override
    public StudentSchedule create(StudentSchedule dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
