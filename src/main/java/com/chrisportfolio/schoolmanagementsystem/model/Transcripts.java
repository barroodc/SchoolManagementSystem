package com.chrisportfolio.schoolmanagementsystem.model;

public class Transcripts {

    private Long transcriptID;
    private Long studentID;
    private String className;
    private String yearOrSemester;
    private String finalGrade;
    private double credits;

    public Long getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(Long transcriptID) {
        this.transcriptID = transcriptID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getYearOrSemester() {
        return yearOrSemester;
    }

    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
