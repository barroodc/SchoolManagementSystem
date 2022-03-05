package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"gradeLevelID", "name", "description"})

@XmlRootElement(name = "GradeLevel")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"gradeLevelID", "name", "description"})
public class GradeLevel {

    @JsonProperty("gradeLevelID")
    private Long gradeLevelID;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

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
