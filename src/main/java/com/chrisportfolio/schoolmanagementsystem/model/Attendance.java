package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"attendanceID", "studentID", "perfectAttendance", "acceptableAttendance",
        "unacceptableAttendance", "excusedAbsences", "unexcusedAbsences", "tardy", "remark"})

@XmlRootElement(name = "Attendance")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"attendanceID", "studentID", "perfectAttendance", "acceptableAttendance",
        "unacceptableAttendance", "excusedAbsences", "unexcusedAbsences", "tardy", "remark"})

public class Attendance {

    @JsonProperty("attendanceID")
    private Long attendanceID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("perfectAttendance")
    private byte perfectAttendance;
    @JsonProperty("acceptableAttendance")
    private byte acceptableAttendance;
    @JsonProperty("unacceptableAttendance")
    private byte unacceptableAttendance;
    @JsonProperty("excusedAbsences")
    private int excusedAbsences;
    @JsonProperty("unexcusedAbsences")
    private int unexcusedAbsences;
    @JsonProperty("tardy")
    private int tardy;
    @JsonProperty("remark")
    private String remark;

    @JsonAnyGetter
    @XmlAttribute
    public Long getAttendanceID() {
        return attendanceID;
    }

    @JsonAnySetter
    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
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
    @XmlElement(name = "perfectAttendance")
    public byte getPerfectAttendance() {
        return perfectAttendance;
    }

    @JsonAnySetter
    public void setPerfectAttendance(byte perfectAttendance) {
        this.perfectAttendance = perfectAttendance;
    }

    @JsonAnyGetter
    @XmlElement(name = "acceptableAttendance")
    public byte getAcceptableAttendance() {
        return acceptableAttendance;
    }

    @JsonAnySetter
    public void setAcceptableAttendance(byte acceptableAttendance) {
        this.acceptableAttendance = acceptableAttendance;
    }

    @JsonAnyGetter
    @XmlElement(name = "unacceptableAttendance")
    public byte getUnacceptableAttendance() {
        return unacceptableAttendance;
    }

    @JsonAnySetter
    public void setUnacceptableAttendance(byte unacceptableAttendance) {
        this.unacceptableAttendance = unacceptableAttendance;
    }

    @JsonAnyGetter
    @XmlElement(name = "excusedAbsences")
    public int getExcusedAbsences() {
        return excusedAbsences;
    }

    @JsonAnySetter
    public void setExcusedAbsences(int excusedAbsences) {
        this.excusedAbsences = excusedAbsences;
    }

    @JsonAnyGetter
    @XmlElement(name = "unexcusedAbsences")
    public int getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    @JsonAnySetter
    public void setUnexcusedAbsences(int unexcusedAbsences) {
        this.unexcusedAbsences = unexcusedAbsences;
    }

    @JsonAnyGetter
    @XmlElement(name = "tardy")
    public int getTardy() {
        return tardy;
    }

    @JsonAnySetter
    public void setTardy(int tardy) {
        this.tardy = tardy;
    }

    @JsonAnyGetter
    @XmlElement(name = "remark")
    public String getRemark() {
        return remark;
    }

    @JsonAnySetter
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceID=" + attendanceID +
                ", studentID=" + studentID +
                ", perfectAttendance=" + perfectAttendance +
                ", acceptableAttendance=" + acceptableAttendance +
                ", unacceptableAttendance=" + unacceptableAttendance +
                ", excusedAbsences=" + excusedAbsences +
                ", unexcusedAbsences=" + unexcusedAbsences +
                ", tardy=" + tardy +
                ", remark='" + remark + '\'' +
                '}';
    }
}
