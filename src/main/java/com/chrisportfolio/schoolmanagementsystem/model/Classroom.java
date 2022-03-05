package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"classroomID", "teacherID", "gradeLevelID", "teacherScheduleID", "section", "remarks"})

@XmlRootElement(name = "Classroom")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"classroomID", "teacherID", "gradeLevelID", "teacherScheduleID", "section", "remarks"})

public class Classroom {

    @JsonProperty("classroomID")
    private Long classroomID;
    @JsonProperty("teacherID")
    private Long teacherID;
    @JsonProperty("gradeLevelID")
    private Long gradeLevelID;
    @JsonProperty("teacherScheduleID")
    private Long teacherScheduleID;
    @JsonProperty("section")
    private String section;
    @JsonProperty("remarks")
    private String remarks;

    @JsonAnyGetter
    @XmlAttribute
    public Long getClassroomID() {
        return classroomID;
    }

    @JsonAnySetter
    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
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
    @XmlAttribute
    public Long getGradeLevelID() {
        return gradeLevelID;
    }

    @JsonAnySetter
    public void setGradeLevelID(Long gradeLevelID) {
        this.gradeLevelID = gradeLevelID;
    }

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
    @XmlElement(name = "section")
    public String getSection() {
        return section;
    }

    @JsonAnySetter
    public void setSection(String section) {
        this.section = section;
    }

    @JsonAnyGetter
    @XmlElement(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonAnySetter
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
