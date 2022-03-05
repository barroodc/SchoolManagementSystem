package com.chrisportfolio.schoolmanagementsystem.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ExamType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"examTypeID", "name", "description"})

public class ExamType {

    private Long examTypeID;
    private String name;
    private String description;

    @XmlAttribute
    public Long getExamTypeID() {
        return examTypeID;
    }

    public void setExamTypeID(Long examTypeID) {
        this.examTypeID = examTypeID;
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
