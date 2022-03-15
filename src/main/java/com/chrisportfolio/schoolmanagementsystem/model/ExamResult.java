package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"examResultID", "examID", "courseID", "studentID", "mark", "grade"})

@XmlRootElement(name = "ExamResult")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examResultID", "examID", "courseID", "studentID", "mark", "grade"})

public class ExamResult {

    @JsonProperty("examResultID")
    private Long examResultID;
    @JsonProperty("examID")
    private Long examID;
    @JsonProperty("courseID")
    private Long courseID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("mark")
    private double mark;
    @JsonProperty("grade")
    private String grade;

    @JsonAnyGetter
    @XmlAttribute
    public Long getExamResultID() {
        return examResultID;
    }

    @JsonAnySetter
    public void setExamResultID(Long examResultID) {
        this.examResultID = examResultID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getExamID() {
        return examID;
    }

    @JsonAnySetter
    public void setExamID(Long examID) {
        this.examID = examID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getCourseID() {
        return courseID;
    }

    @JsonAnySetter
    public void setCourseID(Long courseID) {
        this.courseID = courseID;
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
    @XmlElement(name = "mark")
    public double getMark() {
        return mark;
    }

    @JsonAnySetter
    public void setMark(double mark) {
        this.mark = mark;
    }

    @JsonAnyGetter
    @XmlElement(name = "grade")
    public String getGrade() {
        return grade;
    }

    @JsonAnySetter
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "examResultID=" + examResultID +
                ", examID=" + examID +
                ", courseID=" + courseID +
                ", studentID=" + studentID +
                ", mark=" + mark +
                ", grade='" + grade + '\'' +
                '}';
    }
}
