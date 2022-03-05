package com.chrisportfolio.schoolmanagementsystem.model;

import com.sun.xml.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ReportCard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"reportCardID", "studentID", "teacherID", "studentName", "gradeLevel", "subject", "midterm",
"finalExam", "finalGrade"})

public class ReportCard {

    private Long reportCardID;
    private Long studentID;
    private Long teacherID;
    private String studentName;
    private String gradeLevel;
    private String subject;
    private String midterm;
    private String finalExam;
    private String finalGrade;

    public Long getReportCardID() {
        return reportCardID;
    }

    public void setReportCardID(Long reportCardID) {
        this.reportCardID = reportCardID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMidterm() {
        return midterm;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
