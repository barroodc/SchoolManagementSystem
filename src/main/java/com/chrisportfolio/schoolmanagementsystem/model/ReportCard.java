package com.chrisportfolio.schoolmanagementsystem.model;

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

    @XmlAttribute
    public Long getReportCardID() {
        return reportCardID;
    }

    public void setReportCardID(Long reportCardID) {
        this.reportCardID = reportCardID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @XmlElement(name = "studentName")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @XmlElement(name = "gradeLevel")
    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @XmlElement(name = "midterm")
    public String getMidterm() {
        return midterm;
    }

    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    @XmlElement(name = "finalExam")
    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    @XmlElement(name = "finalGrade")
    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
