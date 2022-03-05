package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Attendance")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"attendanceID", "studentID", "perfectAttendance", "acceptableAttendance",
        "unacceptableAttendance", "excusedAbsences", "unexcusedAbsences", "tardy", "remark"})

public class Attendance {

    private Long attendanceID;
    private Long studentID;
    private short perfectAttendance;
    private short acceptableAttendance;
    private short unacceptableAttendance;
    private int excusedAbsences;
    private int unexcusedAbsences;
    private int tardy;
    private String remark;

    @XmlAttribute
    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    @XmlAttribute
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @XmlElement(name = "perfectAttendance")
    public short getPerfectAttendance() {
        return perfectAttendance;
    }

    public void setPerfectAttendance(short perfectAttendance) {
        this.perfectAttendance = perfectAttendance;
    }

    @XmlElement(name = "acceptableAttendance")
    public short getAcceptableAttendance() {
        return acceptableAttendance;
    }

    public void setAcceptableAttendance(short acceptableAttendance) {
        this.acceptableAttendance = acceptableAttendance;
    }

    @XmlElement(name = "unacceptableAttendance")
    public short getUnacceptableAttendance() {
        return unacceptableAttendance;
    }

    public void setUnacceptableAttendance(short unacceptableAttendance) {
        this.unacceptableAttendance = unacceptableAttendance;
    }

    @XmlElement(name = "excusedAbsences")
    public int getExcusedAbsences() {
        return excusedAbsences;
    }

    public void setExcusedAbsences(int excusedAbsences) {
        this.excusedAbsences = excusedAbsences;
    }

    @XmlElement(name = "unexcusedAbsences")
    public int getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    public void setUnexcusedAbsences(int unexcusedAbsences) {
        this.unexcusedAbsences = unexcusedAbsences;
    }

    @XmlElement(name = "tardy")
    public int getTardy() {
        return tardy;
    }

    public void setTardy(int tardy) {
        this.tardy = tardy;
    }

    @XmlElement(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
