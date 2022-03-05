package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Classroom")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"classroomID", "teacherID", "gradeLevelID", "teacherScheduleID", "section", "remarks"})

public class Classroom {

    private Long classroomID;
    private Long teacherID;
    private Long gradeLevelID;
    private Long teacherScheduleID;
    private String section;
    private String remarks;

    @XmlAttribute
    public Long getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(Long classroomID) {
        this.classroomID = classroomID;
    }

    @XmlAttribute
    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }

    @XmlAttribute
    public Long getGradeLevelID() {
        return gradeLevelID;
    }

    public void setGradeLevelID(Long gradeLevelID) {
        this.gradeLevelID = gradeLevelID;
    }

    @XmlAttribute
    public Long getTeacherScheduleID() {
        return teacherScheduleID;
    }

    public void setTeacherScheduleID(Long teacherScheduleID) {
        this.teacherScheduleID = teacherScheduleID;
    }

    @XmlElement(name = "section")
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @XmlElement(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
