package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ExamResult")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examResultID", "examID", "courseID", "studentID", "mark", "grade"})

public class ExamResult {

    private Long examResultID;
    private Long examID;
    private Long courseID;
    private Long studentID;
    private double mark;
    private String grade;

    @XmlAttribute
    public Long getExamResultID() {
        return examResultID;
    }

    public void setExamResultID(Long examResultID) {
        this.examResultID = examResultID;
    }

    @XmlAttribute
    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    @XmlAttribute
    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlElement(name = "mark")
    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @XmlElement(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
