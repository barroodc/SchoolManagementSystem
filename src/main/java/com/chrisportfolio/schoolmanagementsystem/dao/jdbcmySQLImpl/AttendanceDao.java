package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAttendanceDao;
import com.chrisportfolio.schoolmanagementsystem.model.Attendance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class AttendanceDao extends AbstractMySQLDao<Attendance> implements IAttendanceDao {

    private static final Logger LOGGER = LogManager.getLogger(AttendanceDao.class);

    private static final String INSERT = "INSERT INTO attendance (attendance_id, student_id, perfect_attendance, acceptable_attendance, " +
            "unacceptable_attendance, excused_absences, unexcused_absences, tardy, remark) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT attendance_id, student_id, perfect_attendance, acceptable_attendance," +
            " unacceptable_attendance, excused_absences, unexcused_absences, tardy, remark FROM attendance WHERE attendance_id = ?";

    private static final String UPDATE = "UPDATE attendance SET student_id = ?, perfect_attendance = ?, acceptable_attendance = ?, " +
            "unacceptable_attendance = ?, excused_absences = ?, unexcused_absences = ?, tardy = ?, remark = ? FROM attendance WHERE attendance_id = ?";

    private static final String DELETE = "DELETE FROM attendance WHERE attendance_id = ?";

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
