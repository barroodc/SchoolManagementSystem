package com.chrisportfolio.schoolmanagementsystem.model;

public class GradeLevel {

    private Long gradeID;
    private String name;
    private String description;

    public Long getGradeID() {
        return gradeID;
    }

    public void setGradeID(Long gradeID) {
        this.gradeID = gradeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
