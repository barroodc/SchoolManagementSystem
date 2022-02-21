package com.chrisportfolio.schoolmanagementsystem.model;

import java.sql.Date;

public class Homework {

    private Long homeworkID;
    private String subject;
    private Date assignedDate;
    private Date dueDate;
    private double mark;
    private String grade;
    private String teacherName;
    private String description;

    public Long getHomeworkID() {
        return homeworkID;
    }

    public void setHomeworkID(Long homeworkID) {
        this.homeworkID = homeworkID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
