package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Course")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"courseID", "gradeLevelID", "name", "description"})
public class Course {

    private Long courseID;
    private Long gradeLevelID;
    private String name;
    private String description;

    @XmlAttribute
    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    @XmlAttribute
    public Long getGradeLevelID() {
        return gradeLevelID;
    }

    public void setGradeLevelID(Long gradeLevelID) {
        this.gradeLevelID = gradeLevelID;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
