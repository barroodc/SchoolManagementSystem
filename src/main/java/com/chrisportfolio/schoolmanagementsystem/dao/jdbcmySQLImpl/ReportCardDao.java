package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IReportCardDao;
import com.chrisportfolio.schoolmanagementsystem.model.ReportCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ReportCardDao extends AbstractMySQLDao<ReportCard> implements IReportCardDao {

    private static final Logger LOGGER = LogManager.getLogger(ReportCardDao.class);

    private static final String INSERT = "INSERT INTO report_card (report_card_id, student_id, teacher_id, student_name, " +
            "grade_level, subject, midterm, final_exam, final_grade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT report_card_id, student_id, teacher_id, student_name," +
            "grade_level, subject, midterm, final_exam, final_grade FROM report_card WHERE report_card_id = ?";

    private static final String UPDATE = "UPDATE report_card SET student_id = ?, teacher_id = ?, student_name = ?, " +
            "grade_level = ?, subject = ?, midterm = ?, final_exam = ?, final_grade = ? FROM report_card WHERE report_card_id = ?";

    private static final String DELETE = "DELETE FROM report_card WHERE report_card_id = ?";

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
