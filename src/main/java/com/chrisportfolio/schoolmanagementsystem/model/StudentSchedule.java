package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;
import java.sql.Time;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"studentScheduleID", "studentID", "dayOfWeek", "time", "location", "lunchBreak", "classRoom",
        "courseName", "totalNumberOfCredits"})

@XmlRootElement(name = "StudentSchedule")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"studentScheduleID", "studentID", "dayOfWeek", "time", "location", "lunchBreak", "classRoom",
"courseName", "totalNumberOfCredits"})

public class StudentSchedule {

    @JsonProperty("studentScheduleID")
    private Long studentScheduleID;
    @JsonProperty("studentID")
    private Long studentID;
    @JsonProperty("dayOfWeek")
    private String dayOfWeek;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("location")
    private String location;
    @JsonProperty("lunchBreak")
    private String lunchBreak;
    @JsonProperty("classRoom")
    private String classRoom;
    @JsonProperty("courseName")
    private String courseName;
    @JsonProperty("totalNumberOfCredits")
    private Double totalNumberOfCredits;

    @JsonAnyGetter
    @XmlAttribute
    public Long getStudentScheduleID() {
        return studentScheduleID;
    }

    @JsonAnySetter
    public void setStudentScheduleID(Long studentScheduleID) {
        this.studentScheduleID = studentScheduleID;
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
    @XmlElement(name = "location")
    public String getLocation() {
        return location;
    }

    @JsonAnySetter
    public void setLocation(String location) {
        this.location = location;
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
    @XmlElement(name = "classRoom")
    public String getClassRoom() {
        return classRoom;
    }

    @JsonAnySetter
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @JsonAnyGetter
    @XmlElement(name = "courseName")
    public String getCourseName() {
        return courseName;
    }

    @JsonAnySetter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @JsonAnyGetter
    @XmlElement(name = "totalNumberOfCredits")
    public Double getTotalNumberOfCredits() {
        return totalNumberOfCredits;
    }

    @JsonAnySetter
    public void setTotalNumberOfCredits(Double totalNumberOfCredits) {
        this.totalNumberOfCredits = totalNumberOfCredits;
    }

    @Override
    public String toString() {
        return "StudentSchedule{" +
                "studentScheduleID=" + studentScheduleID +
                ", studentID=" + studentID +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", lunchBreak='" + lunchBreak + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", courseName='" + courseName + '\'' +
                ", totalNumberOfCredits=" + totalNumberOfCredits +
                '}';
    }
}
