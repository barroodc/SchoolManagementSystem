package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Transcripts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptsID", "studentID", "className", "yearOrSemester", "finalGrade", "credits"})

public class Transcripts {

    private Long transcriptsID;
    private Long studentID;
    private String className;
    private String yearOrSemester;
    private String finalGrade;
    private double credits;

    @XmlAttribute
    public Long getTranscriptsID() {
        return transcriptsID;
    }

    public void setTranscriptsID(Long transcriptsID) {
        this.transcriptsID = transcriptsID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlElement(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlElement(name = "yearOrSemester")
    public String getYearOrSemester() {
        return yearOrSemester;
    }

    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    @XmlElement(name = "finalGrade")
    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @XmlElement(name = "credits")
    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
