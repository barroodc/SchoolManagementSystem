package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.sql.Time;

@XmlRootElement(name = "StudentSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentScheduleID", "studentID", "dayOfWeek", "time", "location", "lunchBreak", "classRoom",
"courseName", "totalNumberOfCredits"})

public class StudentSchedule {

    private Long studentScheduleID;
    private Long studentID;
    private String dayOfWeek;
    private Time time;
    private String location;
    private String lunchBreak;
    private String classRoom;
    private String courseName;
    private Double totalNumberOfCredits;

    public Long getStudentScheduleID() {
        return studentScheduleID;
    }

    public void setStudentScheduleID(Long studentScheduleID) {
        this.studentScheduleID = studentScheduleID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLunchBreak() {
        return lunchBreak;
    }

    public void setLunchBreak(String lunchBreak) {
        this.lunchBreak = lunchBreak;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getTotalNumberOfCredits() {
        return totalNumberOfCredits;
    }

    public void setTotalNumberOfCredits(Double totalNumberOfCredits) {
        this.totalNumberOfCredits = totalNumberOfCredits;
    }
}
