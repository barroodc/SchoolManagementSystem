package com.chrisportfolio.schoolmanagementsystem.model;

import com.fasterxml.jackson.annotation.*;

import javax.xml.bind.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"transcriptGPAID", "transcriptsID", "totalCreditsEarned", "GPA"})

@XmlRootElement(name = "TranscriptGPA")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"transcriptGPAID", "transcriptsID", "totalCreditsEarned", "GPA"})

public class TranscriptGPA {

    @JsonProperty("transcriptGPAID")
    private Long transcriptGPAID;
    @JsonProperty("transcriptsID")
    private Long transcriptsID;
    @JsonProperty("totalCreditsEarned")
    private double totalCreditsEarned;
    @JsonProperty("GPA")
    private double GPA;

    @JsonAnyGetter
    @XmlAttribute
    public Long getTranscriptGPAID() {
        return transcriptGPAID;
    }

    @JsonAnySetter
    public void setTranscriptGPAID(Long transcriptGPAID) {
        this.transcriptGPAID = transcriptGPAID;
    }

    @JsonAnyGetter
    @XmlAttribute
    public Long getTranscriptsID() {
        return transcriptsID;
    }

    @JsonAnySetter
    public void setTranscriptsID(Long transcriptsID) {
        this.transcriptsID = transcriptsID;
    }

    @JsonAnyGetter
    @XmlElement(name = "totalCreditsEarned")
    public double getTotalCreditsEarned() {
        return totalCreditsEarned;
    }

    @JsonAnySetter
    public void setTotalCreditsEarned(double totalCreditsEarned) {
        this.totalCreditsEarned = totalCreditsEarned;
    }

    @JsonAnyGetter
    @XmlElement(name = "GPA")
    public double getGPA() {
        return GPA;
    }

    @JsonAnySetter
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "TranscriptGPA{" +
                "transcriptGPAID=" + transcriptGPAID +
                ", transcriptsID=" + transcriptsID +
                ", totalCreditsEarned=" + totalCreditsEarned +
                ", GPA=" + GPA +
                '}';
    }
}
