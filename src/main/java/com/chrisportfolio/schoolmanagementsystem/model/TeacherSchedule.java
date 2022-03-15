package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;
import java.sql.Time;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"teacherScheduleID", "teacherID", "dayOfWeek", "time", "lunchBreak", "courseTaught"})

@XmlRootElement(name = "TeacherSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"teacherScheduleID", "teacherID", "dayOfWeek", "time", "lunchBreak", "courseTaught"})

public class TeacherSchedule {

    @JsonProperty("teacherScheduleID")
    private Long teacherScheduleID;
    @JsonProperty("teacherID")
    private Long teacherID;
    @JsonProperty("dayOfWeek")
    private String dayOfWeek;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("lunchBreak")
    private String lunchBreak;
    @JsonProperty("courseTaught")
    private String courseTaught;

    @JsonAnyGetter
    @XmlAttribute
    public Long getTeacherScheduleID() {
        return teacherScheduleID;
    }

    @JsonAnySetter
    public void setTeacherScheduleID(Long teacherScheduleID) {
        this.teacherScheduleID = teacherScheduleID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    @JsonAnySetter
    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @JsonAnyGetter
    @XmlElement(name = "dayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @JsonAnySetter
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @JsonAnyGetter
    @XmlElement(name = "time")
    public Time getTime() {
        return time;
    }

    @JsonAnySetter
    public void setTime(Time time) {
        this.time = time;
    }

    @JsonAnyGetter
    @XmlElement(name = "lunchBreak")
    public String getLunchBreak() {
        return lunchBreak;
    }

    @JsonAnySetter
    public void setLunchBreak(String lunchBreak) {
        this.lunchBreak = lunchBreak;
    }

    @JsonAnyGetter
    @XmlElement(name = "courseTaught")
    public String getCourseTaught() {
        return courseTaught;
    }

    @JsonAnySetter
    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

    @Override
    public String toString() {
        return "TeacherSchedule{" +
                "teacherScheduleID=" + teacherScheduleID +
                ", teacherID=" + teacherID +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", time=" + time +
                ", lunchBreak='" + lunchBreak + '\'' +
                ", courseTaught='" + courseTaught + '\'' +
                '}';
    }
}
