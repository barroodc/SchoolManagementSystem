package com.chrisportfolio.schoolmanagementsystem.model;


import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"examTypeID", "name", "description"})

@XmlRootElement(name = "ExamType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examTypeID", "name", "description"})

public class ExamType {

    @JsonProperty("examTypeID")
    private Long examTypeID;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

    @JsonAnyGetter
    @XmlAttribute
    public Long getExamTypeID() {
        return examTypeID;
    }

    @JsonAnySetter
    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
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

    @Override
    public String toString() {
        return "ExamType{" +
                "examTypeID=" + examTypeID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
