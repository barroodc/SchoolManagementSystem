package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAttendanceDao;
import com.chrisportfolio.schoolmanagementsystem.model.Attendance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Attendance findByID(long id) {
        Attendance attendance = new Attendance();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                attendance.setAttendanceID(rs.getLong("attendance_id"));
                attendance.setStudentID(rs.getLong("student_id"));
                attendance.setPerfectAttendance(rs.getByte("perfect_attendance"));
                attendance.setAcceptableAttendance(rs.getByte("acceptable_attendance"));
                attendance.setUnacceptableAttendance(rs.getByte("unacceptable_attendance"));
                attendance.setExcusedAbsences(rs.getInt("excused_absences"));
                attendance.setUnexcusedAbsences(rs.getInt("unexcused_absences"));
                attendance.setTardy(rs.getInt("tardy"));
                attendance.setRemark(rs.getString("remark"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return attendance;
    }

    @Override
    public List<Attendance> findAll() {
        return null;
    }

    @Override
    public Attendance update(Attendance dto) {
        Attendance attendance = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setShort(2, dto.getPerfectAttendance());
            statement.setShort(3, dto.getAcceptableAttendance());
            statement.setShort(4, dto.getUnacceptableAttendance());
            statement.setInt(5, dto.getExcusedAbsences());
            statement.setInt(6, dto.getUnexcusedAbsences());
            statement.setInt(7, dto.getTardy());
            statement.setString(8, dto.getRemark());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return attendance;
    }

    @Override
    public Attendance create(Attendance dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getAttendanceID());
            statement.setLong(2, dto.getStudentID());
            statement.setShort(3, dto.getPerfectAttendance());
            statement.setShort(4, dto.getAcceptableAttendance());
            statement.setShort(5, dto.getUnacceptableAttendance());
            statement.setInt(6, dto.getExcusedAbsences());
            statement.setInt(7, dto.getUnexcusedAbsences());
            statement.setInt(8, dto.getTardy());
            statement.setString(9, dto.getRemark());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
