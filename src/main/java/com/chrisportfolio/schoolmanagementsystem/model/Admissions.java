package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.*;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "admissionsID", "studentID", "applicationNumber", "applicantName", "incomingYear", "status", "lastModified", "inquiries"
})

@XmlRootElement(name = "Admissions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"admissionsID", "studentID", "applicationNumber", "applicantName", "incomingYear", "status", "lastModified", "inquiries"})
public class Admissions {

    @JsonProperty("admissionsID")
    private Long admissionsID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("applicationNumber")
    private Long applicationNumber;
    @JsonProperty("applicantName")
    private String applicantName;
    @JsonProperty("incomingYear")
    private String incomingYear;
    @JsonProperty("status")
    private String status;
    @JsonProperty("lastModified")
    private Date lastModified;
    @JsonProperty("inquiries")
    private String inquiries;

    @JsonAnyGetter
    @XmlAttribute
    public Long getAdmissionsID() {
        return admissionsID;
    }

    @JsonAnySetter
    public void setAdmissionsID(Long admissionsID) {
        this.admissionsID = admissionsID;
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
    @XmlElement(name = "applicationNumber")
    public Long getApplicationNumber() {
        return applicationNumber;
    }

    @JsonAnySetter
    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    @JsonAnyGetter
    @XmlElement(name = "applicantName")
    public String getApplicantName() {
        return applicantName;
    }

    @JsonAnySetter
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    @JsonAnyGetter
    @XmlElement(name = "incomingYear")
    public String getIncomingYear() {
        return incomingYear;
    }

    @JsonAnySetter
    public void setIncomingYear(String incomingYear) {
        this.incomingYear = incomingYear;
    }

    @JsonAnyGetter
    @XmlElement(name = "status")
    public String getStatus() {
        return status;
    }

    @JsonAnySetter
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonAnyGetter
    @XmlElement(name = "lastModified")
    public Date getLastModified() {
        return lastModified;
    }

    @JsonAnySetter
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @JsonAnyGetter
    @XmlElement(name = "inquiries")
    public String getInquiries() {
        return inquiries;
    }

    @JsonAnySetter
    public void setInquiries(String inquiries) {
        this.inquiries = inquiries;
    }

    @Override
    public String toString() {
        return "Admissions{" +
                "admissionsID=" + admissionsID +
                ", studentID=" + studentID +
                ", applicationNumber=" + applicationNumber +
                ", applicantName='" + applicantName + '\'' +
                ", incomingYear='" + incomingYear + '\'' +
                ", status='" + status + '\'' +
                ", lastModified=" + lastModified +
                ", inquiries='" + inquiries + '\'' +
                '}';
    }
}
