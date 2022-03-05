package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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

    public Long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(Long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public short getPerfectAttendance() {
        return perfectAttendance;
    }

    public void setPerfectAttendance(short perfectAttendance) {
        this.perfectAttendance = perfectAttendance;
    }

    public short getAcceptableAttendance() {
        return acceptableAttendance;
    }

    public void setAcceptableAttendance(short acceptableAttendance) {
        this.acceptableAttendance = acceptableAttendance;
    }

    public short getUnacceptableAttendance() {
        return unacceptableAttendance;
    }

    public void setUnacceptableAttendance(short unacceptableAttendance) {
        this.unacceptableAttendance = unacceptableAttendance;
    }

    public int getExcusedAbsences() {
        return excusedAbsences;
    }

    public void setExcusedAbsences(int excusedAbsences) {
        this.excusedAbsences = excusedAbsences;
    }

    public int getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    public void setUnexcusedAbsences(int unexcusedAbsences) {
        this.unexcusedAbsences = unexcusedAbsences;
    }

    public int getTardy() {
        return tardy;
    }

    public void setTardy(int tardy) {
        this.tardy = tardy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
