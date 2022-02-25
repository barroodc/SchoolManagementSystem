package com.chrisportfolio.schoolmanagementsystem.model;

public class Attendance {

    private Long attendanceID;
    private Long studentID;
    private short perfectAttendance;
    private short acceptableAttendance;
    private short unacceptableAttendance;
    private int excused_absences;
    private int unexcused_absences;
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

    public int getExcused_absences() {
        return excused_absences;
    }

    public void setExcused_absences(int excused_absences) {
        this.excused_absences = excused_absences;
    }

    public int getUnexcused_absences() {
        return unexcused_absences;
    }

    public void setUnexcused_absences(int unexcused_absences) {
        this.unexcused_absences = unexcused_absences;
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
