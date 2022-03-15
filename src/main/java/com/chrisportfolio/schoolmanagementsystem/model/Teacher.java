package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"teacherID", "email", "password", "firstName", "lastName", "dob", "subject", "homePhone",
        "mobile", "tenured", "lastLoginDate", "lastLoginIP"})

@XmlRootElement(name = "Teacher")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherID", "email", "password", "firstName", "lastName", "dob", "subject", "homePhone",
        "mobile", "tenured", "lastLoginDate", "lastLoginIP"})
public class Teacher {

    @JsonProperty("teacherID")
    private Long teacherID;
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
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("homePhone")
    private String homePhone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("tenured")
    private short tenured;
    @JsonProperty("lastLoginDate")
    private Date lastLoginDate;
    @JsonProperty("lastLoginIP")
    private String lastLoginIP;

    @JsonAnyGetter
    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    @JsonAnySetter
    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
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
    @XmlElement(name = "firstName")
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
    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    @JsonAnySetter
    public void setSubject(String subject) {
        this.subject = subject;
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
    @XmlElement(name = "tenured")
    public short getTenured() {
        return tenured;
    }

    @JsonAnySetter
    public void setTenured(short tenured) {
        this.tenured = tenured;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", subject='" + subject + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", tenured=" + tenured +
                ", lastLoginDate=" + lastLoginDate +
                ", lastLoginIP='" + lastLoginIP + '\'' +
                '}';
    }
}
