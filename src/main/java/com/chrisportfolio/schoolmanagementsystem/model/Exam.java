package com.chrisportfolio.schoolmanagementsystem.model;

public class Exam {

    private Long examID;
    private Long examTypeID;
    private String subjects;
    private double marks;
    private String grades;
    private String term;
    private String className;

    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    public Long getExamTypeID() {
        return examTypeID;
    }

    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
