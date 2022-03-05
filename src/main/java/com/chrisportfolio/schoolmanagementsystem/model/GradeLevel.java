package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "GradeLevel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"gradeLevelID", "name", "description"})
public class GradeLevel {

    private Long gradeLevelID;
    private String name;
    private String description;

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
