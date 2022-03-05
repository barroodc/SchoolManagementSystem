package com.chrisportfolio.schoolmanagementsystem.model;

import jakarta.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@XmlRootElement(name = "Admissions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"admissionsID", "studentID", "applicationNumber", "applicantName", "incomingYear", "status", "lastModified", "inquiries"})
public class Admissions {

    private Long admissionsID;
    private Long studentID;
    private Long applicationNumber;
    private String applicantName;
    private String incomingYear;
    private String status;
    private Date lastModified;
    private String inquiries;

    @XmlAttribute
    public Long getAdmissionsID() {
        return admissionsID;
    }

    public void setAdmissionsID(Long admissionsID) {
        this.admissionsID = admissionsID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlElement(name = "applicationNumber")
    public Long getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    @XmlElement(name = "applicantName")
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    @XmlElement(name = "incomingYear")
    public String getIncomingYear() {
        return incomingYear;
    }

    public void setIncomingYear(String incomingYear) {
        this.incomingYear = incomingYear;
    }

    @XmlElement(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "lastModified")
    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @XmlElement(name = "inquiries")
    public String getInquiries() {
        return inquiries;
    }

    public void setInquiries(String inquiries) {
        this.inquiries = inquiries;
    }
}
