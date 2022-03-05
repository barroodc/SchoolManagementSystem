package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"courseID", "gradeLevelID", "name", "description"})

@XmlRootElement(name = "Course")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"courseID", "gradeLevelID", "name", "description"})
public class Course {

    @JsonProperty("courseID")
    private Long courseID;
    @JsonProperty("gradeLevelID")
    private Long gradeLevelID;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

    @JsonAnyGetter
    @XmlAttribute
    public Long getCourseID() {
        return courseID;
    }

    @JsonAnySetter
    public void setCourseID(Long courseID) {
        this.courseID = courseID;
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
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @JsonAnySetter
    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    @XmlElement(name = "description")
    public String getDescription() {
        return description;
    }

    @JsonAnySetter
    public void setDescription(String description) {
        this.description = description;
    }
}
