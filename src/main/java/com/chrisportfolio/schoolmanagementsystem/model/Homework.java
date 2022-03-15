package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"homeworkID", "studentID", "subject", "assignedDate", "dueDate", "mark", "grade", "teacherName",
        "description"})

@XmlRootElement(name = "Homework")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"homeworkID", "studentID", "subject", "assignedDate", "dueDate", "mark", "grade", "teacherName",
"description"})
public class Homework {

    @JsonProperty("homeworkID")
    private Long homeworkID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("assignedDate")
    private Date assignedDate;
    @JsonProperty("dueDate")
    private Date dueDate;
    @JsonProperty("mark")
    private double mark;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("teacherName")
    private String teacherName;
    @JsonProperty("description")
    private String description;

    @JsonAnyGetter
    @XmlAttribute
    public Long getHomeworkID() {
        return homeworkID;
    }

    @JsonAnySetter
    public void setHomeworkID(Long homeworkID) {
        this.homeworkID = homeworkID;
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
    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    @JsonAnySetter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonAnyGetter
    @XmlElement(name = "assignedDate")
    public Date getAssignedDate() {
        return assignedDate;
    }

    @JsonAnySetter
    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    @JsonAnyGetter
    @XmlElement(name = "dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    @JsonAnySetter
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    @JsonAnyGetter
    @XmlElement(name = "teacherName")
    public String getTeacherName() {
        return teacherName;
    }

    @JsonAnySetter
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @JsonAnyGetter
    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    @JsonAnySetter
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "homeworkID=" + homeworkID +
                ", studentID=" + studentID +
                ", subject='" + subject + '\'' +
                ", assignedDate=" + assignedDate +
                ", dueDate=" + dueDate +
                ", mark=" + mark +
                ", grade='" + grade + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
