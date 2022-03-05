package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"transcriptsID", "studentID", "className", "yearOrSemester", "finalGrade", "credits"})

@XmlRootElement(name = "Transcripts")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptsID", "studentID", "className", "yearOrSemester", "finalGrade", "credits"})

public class Transcripts {

    @JsonProperty("transcriptsID")
    private Long transcriptsID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("className")
    private String className;
    @JsonProperty("yearOrSemester")
    private String yearOrSemester;
    @JsonProperty("finalGrade")
    private String finalGrade;
    @JsonProperty("credits")
    private double credits;

    @JsonAnyGetter
    @XmlAttribute
    public Long getTranscriptsID() {
        return transcriptsID;
    }

    @JsonAnySetter
    public void setTranscriptsID(Long transcriptsID) {
        this.transcriptsID = transcriptsID;
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
    @XmlElement(name = "className")
    public String getClassName() {
        return className;
    }

    @JsonAnySetter
    public void setClassName(String className) {
        this.className = className;
    }

    @JsonAnyGetter
    @XmlElement(name = "yearOrSemester")
    public String getYearOrSemester() {
        return yearOrSemester;
    }

    @JsonAnySetter
    public void setYearOrSemester(String yearOrSemester) {
        this.yearOrSemester = yearOrSemester;
    }

    @JsonAnyGetter
    @XmlElement(name = "finalGrade")
    public String getFinalGrade() {
        return finalGrade;
    }

    @JsonAnySetter
    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @JsonAnyGetter
    @XmlElement(name = "credits")
    public double getCredits() {
        return credits;
    }

    @JsonAnySetter
    public void setCredits(double credits) {
        this.credits = credits;
    }
}
