package com.chrisportfolio.schoolmanagementsystem.model;

public class ExamResult {

    private Long examResultID;
    private double mark;
    private String grade;

    public Long getExamResultID() {
        return examResultID;
    }

    public void setExamResultID(Long examResultID) {
        this.examResultID = examResultID;
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
}
