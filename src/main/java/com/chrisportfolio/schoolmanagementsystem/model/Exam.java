package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Exam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examID", "examTypeID", "subjects", "marks", "grades", "term", "className"})
public class Exam {

    private Long examID;
    private Long examTypeID;
    private String subjects;
    private double marks;
    private String grades;
    private String term;
    private String className;

    @XmlAttribute
    public Long getExamID() {
        return examID;
    }

    public void setExamID(Long examID) {
        this.examID = examID;
    }

    @XmlAttribute
    public Long getExamTypeID() {
        return examTypeID;
    }

    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
    }

    @XmlElement(name = "subjects")
    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @XmlElement(name = "marks")
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @XmlElement(name = "grades")
    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @XmlElement(name = "term")
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @XmlElement(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
