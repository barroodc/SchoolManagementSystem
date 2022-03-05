package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Teacher")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherID", "email", "password", "firstName", "lastName", "dob", "subject", "homePhone",
        "mobile", "tenured", "lastLoginDate", "lastLoginIP"})
public class Teacher {

    private Long teacherID;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date dob;
    private String subject;
    private String homePhone;
    private String mobile;
    private short tenured;
    private Date lastLoginDate;
    private String lastLoginIP;

    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlElement(name = "dob")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @XmlElement(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @XmlElement(name = "homePhone")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @XmlElement(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @XmlElement(name = "tenured")
    public short getTenured() {
        return tenured;
    }

    public void setTenured(short tenured) {
        this.tenured = tenured;
    }

    @XmlElement(name = "lastLoginDate")
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @XmlElement(name = "lastLoginIP")
    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }
}
