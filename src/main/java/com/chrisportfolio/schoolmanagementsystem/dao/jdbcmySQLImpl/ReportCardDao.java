package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IReportCardDao;
import com.chrisportfolio.schoolmanagementsystem.model.ReportCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public ReportCard findByID(long id) {
        ReportCard reportCard = new ReportCard();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                reportCard.setReportCardID(rs.getLong("report_card_id"));
                reportCard.setStudentID(rs.getLong("student_id"));
                reportCard.setTeacherID(rs.getLong("teacher_id"));
                reportCard.setStudentName(rs.getString("student_name"));
                reportCard.setGradeLevel(rs.getString("grade_level"));
                reportCard.setSubject(rs.getString("subject"));
                reportCard.setMidterm(rs.getString("midterm"));
                reportCard.setFinalExam(rs.getString("final_exam"));
                reportCard.setFinalGrade(rs.getString("final_grade"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return reportCard;
    }

    @Override
    public List<ReportCard> findAll() {
        return null;
    }

    @Override
    public ReportCard update(ReportCard dto) {
        ReportCard reportCard = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setLong(1, dto.getStudentID());
            statement.setLong(2, dto.getTeacherID());
            statement.setString(3, dto.getStudentName());
            statement.setString(4, dto.getGradeLevel());
            statement.setString(5, dto.getSubject());
            statement.setString(6, dto.getMidterm());
            statement.setString(7, dto.getFinalExam());
            statement.setString(8, dto.getFinalGrade());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return reportCard;
    }

    @Override
    public ReportCard create(ReportCard dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getReportCardID());
            statement.setLong(2, dto.getStudentID());
            statement.setLong(3, dto.getTeacherID());
            statement.setString(4, dto.getStudentName());
            statement.setString(5, dto.getGradeLevel());
            statement.setString(6, dto.getSubject());
            statement.setString(7, dto.getMidterm());
            statement.setString(8, dto.getFinalExam());
            statement.setString(9, dto.getFinalGrade());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.executeQuery();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
