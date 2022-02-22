package com.chrisportfolio.schoolmanagementsystem.model;

public class TranscriptGPA {

    private Long transcriptGPAID;
    private String totalCreditsEarned;
    private double GPA;


    public Long getTranscriptGPAID() {
        return transcriptGPAID;
    }

    public void setTranscriptGPAID(Long transcriptGPAID) {
        this.transcriptGPAID = transcriptGPAID;
    }

    public String getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    public void setTotalCreditsEarned(String totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
