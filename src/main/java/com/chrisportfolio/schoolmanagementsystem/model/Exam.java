package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"examID", "examTypeID", "subjects", "marks", "grades", "term", "className"})

@XmlRootElement(name = "Exam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examID", "examTypeID", "subjects", "marks", "grades", "term", "className"})
public class Exam {

    @JsonProperty("examID")
    private Long examID;
    @JsonProperty("examTypeID")
    private Long examTypeID;
    @JsonProperty("subjects")
    private String subjects;
    @JsonProperty("marks")
    private double marks;
    @JsonProperty("grades")
    private String grades;
    @JsonProperty("term")
    private String term;
    @JsonProperty("classname")
    private String className;

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
    public Long getExamTypeID() {
        return examTypeID;
    }

    @JsonAnySetter
    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
    }

    @JsonAnyGetter
    @XmlElement(name = "subjects")
    public String getSubjects() {
        return subjects;
    }

    @JsonAnySetter
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @JsonAnyGetter
    @XmlElement(name = "marks")
    public double getMarks() {
        return marks;
    }

    @JsonAnySetter
    public void setMarks(double marks) {
        this.marks = marks;
    }

    @JsonAnyGetter
    @XmlElement(name = "grades")
    public String getGrades() {
        return grades;
    }

    @JsonAnySetter
    public void setGrades(String grades) {
        this.grades = grades;
    }

    @JsonAnyGetter
    @XmlElement(name = "term")
    public String getTerm() {
        return term;
    }

    @JsonAnySetter
    public void setTerm(String term) {
        this.term = term;
    }

    @JsonAnyGetter
    @XmlElement(name = "className")
    public String getClassName() {
        return className;
    }

    @JsonAnySetter
    public void setClassName(String className) {
        this.className = className;
    }
}
