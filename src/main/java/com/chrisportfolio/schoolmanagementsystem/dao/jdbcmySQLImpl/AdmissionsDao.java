package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IAdmissionsDao;
import com.chrisportfolio.schoolmanagementsystem.model.Admissions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
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
