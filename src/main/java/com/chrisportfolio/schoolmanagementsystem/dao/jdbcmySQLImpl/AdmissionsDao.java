package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAdmissionsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Admissions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdmissionsDao extends AbstractMySQLDao<Admissions> implements IAdmissionsDao {

    private static final Logger LOGGER = LogManager.getLogger(AdmissionsDao.class);

    private static final String INSERT = "INSERT INTO admissions (admissions_id, student_id, application_number, applicant_name, " +
            "incoming_year, status, last_modified, inquiries) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT admissions_id, student_id, application_number, applicant_name," +
            " incoming_year, status, last_modified, inquiries FROM address WHERE admissions_id = ?";

    private static final String UPDATE = "UPDATE admissions SET student_id = ?, application_number = ?, applicant_name = ?, " +
            "incoming_year = ?, status = ?, last_modified = ?, inquiries = ? FROM admissions WHERE admissions_id = ?";

    private static final String DELETE = "DELETE FROM admissions WHERE admissions_id = ?";

    public AdmissionsDao(Connection connection) {
        super(connection);
    }

    @Override
    public Admissions findByID(long id) {
        Admissions admissions = new Admissions();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                admissions.setAdmissionsID(rs.getLong("admissions_id"));
                admissions.setStudentID(rs.getLong("student_id"));
                admissions.setApplicationNumber(rs.getLong("application_number"));
                admissions.setApplicantName(rs.getString("application_name"));
                admissions.setIncomingYear(rs.getString("incoming_year"));
                admissions.setStatus(rs.getString("status"));
                admissions.setLastModified(rs.getDate("last_modified"));
                admissions.setInquiries(rs.getString("inquiries"));
            }
        } catch(SQLException e) {
            LOGGER.error(e);
        }
        return admissions;
    }

    @Override
    public List<Admissions> findAll() {
        return null;
    }

    @Override
    public Admissions update(Admissions dto) {
        Admissions admissions = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setLong(2, dto.getApplicationNumber());
            statement.setString(3, dto.getApplicantName());
            statement.setString(4, dto.getIncomingYear());
            statement.setString(5, dto.getStatus());
            statement.setDate(6, dto.getLastModified());
            statement.setString(7, dto.getInquiries());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return admissions;
    }

    @Override
    public Admissions create(Admissions dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getAdmissionsID());
            statement.setLong(2, dto.getStudentID());
            statement.setLong(3, dto.getApplicationNumber());
            statement.setString(4, dto.getApplicantName());
            statement.setString(5, dto.getIncomingYear());
            statement.setString(6, dto.getStatus());
            statement.setDate(7, dto.getLastModified());
            statement.setString(8, dto.getInquiries());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1,id);
            statement.execute();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
