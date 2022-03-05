package com.chrisportfolio.schoolmanagementsystem.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "TranscriptGPA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptGPAID", "transcriptsID", "totalCreditsEarned", "GPA"})

public class TranscriptGPA {

    private Long transcriptGPAID;
    private Long transcriptsID;
    private double totalCreditsEarned;
    private double GPA;


    public Long getTranscriptGPAID() {
        return transcriptGPAID;
    }

    public void setTranscriptGPAID(Long transcriptGPAID) {
        this.transcriptGPAID = transcriptGPAID;
    }

    public Long getTranscriptsID() {
        return transcriptsID;
    }

    public void setTranscriptsID(Long transcriptsID) {
        this.transcriptsID = transcriptsID;
    }

    public double getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    public void setTotalCreditsEarned(double totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
