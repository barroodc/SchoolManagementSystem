package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Parent")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"parentID", "email", "password", "firstName", "lastName", "dob", "homePhone", "mobile",
"lastLoginDate", "lastLoginIP"})
public class Parent {

    private Long parentID;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date dob;
    private String homePhone;
    private String mobile;
    private Date lastLoginDate;
    private String lastLoginIP;

    @XmlAttribute
    public Long getParentID() {
        return parentID;
    }

    public void setParentID(Long parentID) {
        this.parentID = parentID;
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
