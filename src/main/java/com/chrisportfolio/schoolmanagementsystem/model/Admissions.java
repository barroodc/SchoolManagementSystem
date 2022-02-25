package com.chrisportfolio.schoolmanagementsystem.model;

import java.sql.Date;

public class Admissions {

    private Long admissionsID;
    private Long studentID;
    private Long applicationNumber;
    private String applicantName;
    private String incomingYear;
    private String status;
    private Date lastModified;
    private String inquiries;

    public Long getAdmissionsID() {
        return admissionsID;
    }

    public void setAdmissionsID(Long admissionsID) {
        this.admissionsID = admissionsID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getIncomingYear() {
        return incomingYear;
    }

    public void setIncomingYear(String incomingYear) {
        this.incomingYear = incomingYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public String getInquiries() {
        return inquiries;
    }

    public void setInquiries(String inquiries) {
        this.inquiries = inquiries;
    }
}
