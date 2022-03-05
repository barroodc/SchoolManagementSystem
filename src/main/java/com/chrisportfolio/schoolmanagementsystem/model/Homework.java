package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Homework")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"homeworkID", "studentID", "subject", "assignedDate", "dueDate", "mark", "grade", "teacherName",
"description"})
public class Homework {

    private Long homeworkID;
    private Long studentID;
    private String subject;
    private Date assignedDate;
    private Date dueDate;
    private double mark;
    private String grade;
    private String teacherName;
    private String description;

    @XmlAttribute
    public Long getHomeworkID() {
        return homeworkID;
    }

    public void setHomeworkID(Long homeworkID) {
        this.homeworkID = homeworkID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @XmlElement(name = "assignedDate")
    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    @XmlElement(name = "dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    @XmlElement(name = "teacherName")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
