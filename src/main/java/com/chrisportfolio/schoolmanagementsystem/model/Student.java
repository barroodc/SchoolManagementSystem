package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"studentID", "parentID", "email", "password", "firstName", "lastName", "dob", "homePhone",
        "mobile", "firstDayOnCampus", "gradeLevel", "gpa", "satScore", "actScore", "lastLoginDate", "lastLoginIP"})

@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentID", "parentID", "email", "password", "firstName", "lastName", "dob", "homePhone",
"mobile", "firstDayOnCampus", "gradeLevel", "gpa", "satScore", "actScore", "lastLoginDate", "lastLoginIP"})

public class Student {

    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("parentID")
    private Long parentID;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("dob")
    private Date dob;
    @JsonProperty("homePhone")
    private String homePhone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("firstDayOnCampus")
    private Date firstDayOnCampus;
    @JsonProperty("gradeLevel")
    private String gradeLevel;
    @JsonProperty("gpa")
    private double gpa;
    @JsonProperty("satScore")
    private int satScore;
    @JsonProperty("actScore")
    private int actScore;
    @JsonProperty("lastLoginDate")
    private Date lastLoginDate;
    @JsonProperty("lastLoginIP")
    private String lastLoginIP;

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
    @XmlAttribute
    public Long getParentID() {
        return parentID;
    }

    @JsonAnySetter
    public void setParentID(Long parentID) {
        this.parentID = parentID;
    }

    @JsonAnyGetter
    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    @JsonAnySetter
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonAnyGetter
    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }

    @JsonAnySetter
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonAnyGetter
    @XmlElement(name = "fistName")
    public String getFirstName() {
        return firstName;
    }

    @JsonAnySetter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonAnyGetter
    @XmlElement(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonAnySetter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonAnyGetter
    @XmlElement(name = "dob")
    public Date getDob() {
        return dob;
    }

    @JsonAnySetter
    public void setDob(Date dob) {
        this.dob = dob;
    }

    @JsonAnyGetter
    @XmlElement(name = "homePhone")
    public String getHomePhone() {
        return homePhone;
    }

    @JsonAnySetter
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @JsonAnyGetter
    @XmlElement(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonAnySetter
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonAnyGetter
    @XmlElement(name = "firstDayOnCampus")
    public Date getFirstDayOnCampus() {
        return firstDayOnCampus;
    }

    @JsonAnySetter
    public void setFirstDayOnCampus(Date firstDayOnCampus) {
        this.firstDayOnCampus = firstDayOnCampus;
    }

    @JsonAnyGetter
    @XmlElement(name = "gradeLevel")
    public String getGradeLevel() {
        return gradeLevel;
    }

    @JsonAnySetter
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @JsonAnyGetter
    @XmlElement(name = "gpa")
    public double getGpa() {
        return gpa;
    }

    @JsonAnySetter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @JsonAnyGetter
    @XmlElement(name = "satScore")
    public int getSatScore() {
        return satScore;
    }

    @JsonAnySetter
    public void setSatScore(int satScore) {
        this.satScore = satScore;
    }

    @JsonAnyGetter
    @XmlElement(name = "actScore")
    public int getActScore() {
        return actScore;
    }

    @JsonAnySetter
    public void setActScore(int actScore) {
        this.actScore = actScore;
    }

    @JsonAnyGetter
    @XmlElement(name = "lastLoginDate")
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    @JsonAnySetter
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @JsonAnyGetter
    @XmlElement(name = "lastLoginIP")
    public String getLastLoginIP() {
        return lastLoginIP;
    }

    @JsonAnySetter
    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }
}
