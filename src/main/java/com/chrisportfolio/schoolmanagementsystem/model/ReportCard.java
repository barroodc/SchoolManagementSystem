package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"reportCardID", "studentID", "teacherID", "studentName", "gradeLevel", "subject", "midterm",
        "finalExam", "finalGrade"})

@XmlRootElement(name = "ReportCard")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"reportCardID", "studentID", "teacherID", "studentName", "gradeLevel", "subject", "midterm",
"finalExam", "finalGrade"})

public class ReportCard {

    @JsonProperty("reportCardID")
    private Long reportCardID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("teacherID")
    private Long teacherID;
    @JsonProperty("studentName")
    private String studentName;
    @JsonProperty("gradeLevel")
    private String gradeLevel;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("midterm")
    private String midterm;
    @JsonProperty("finalExam")
    private String finalExam;
    @JsonProperty("finalGrade")
    private String finalGrade;

    @JsonAnyGetter
    @XmlAttribute
    public Long getReportCardID() {
        return reportCardID;
    }

    @JsonAnySetter
    public void setReportCardID(Long reportCardID) {
        this.reportCardID = reportCardID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    @JsonAnySetter
    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    @JsonAnySetter
    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @JsonAnyGetter
    @XmlElement(name = "studentName")
    public String getStudentName() {
        return studentName;
    }

    @JsonAnySetter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @JsonAnyGetter
    @XmlElement(name = "gradeLevel")
    public String getGradeLevel() {
        return gradeLevel;
    }

    @JsonAnySetter
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @JsonAnyGetter
    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    @JsonAnySetter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonAnyGetter
    @XmlElement(name = "midterm")
    public String getMidterm() {
        return midterm;
    }

    @JsonAnySetter
    public void setMidterm(String midterm) {
        this.midterm = midterm;
    }

    @JsonAnyGetter
    @XmlElement(name = "finalExam")
    public String getFinalExam() {
        return finalExam;
    }

    @JsonAnySetter
    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    @JsonAnyGetter
    @XmlElement(name = "finalGrade")
    public String getFinalGrade() {
        return finalGrade;
    }

    @JsonAnySetter
    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
