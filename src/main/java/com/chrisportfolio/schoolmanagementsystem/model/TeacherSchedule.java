package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;
import java.sql.Time;

@XmlRootElement(name = "TeacherSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherScheduleID", "teacherID", "dayOfWeek", "time", "lunchBreak", "courseTaught"})

public class TeacherSchedule {

    private Long teacherScheduleID;
    private Long teacherID;
    private String dayOfWeek;
    private Time time;
    private String lunchBreak;
    private String courseTaught;

    @XmlAttribute
    public Long getTeacherScheduleID() {
        return teacherScheduleID;
    }

    public void setTeacherScheduleID(Long teacherScheduleID) {
        this.teacherScheduleID = teacherScheduleID;
    }

    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @XmlElement(name = "dayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @XmlElement(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @XmlElement(name = "lunchBreak")
    public String getLunchBreak() {
        return lunchBreak;
    }

    public void setLunchBreak(String lunchBreak) {
        this.lunchBreak = lunchBreak;
    }

    @XmlElement(name = "courseTaught")
    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }
}
