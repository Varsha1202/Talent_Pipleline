package com.example.CandidateProfile.dto;



public class UpdateCandidateProfileRequest {

    private String resumeUrl;

    private Double experienceYears;

    private String education;

    private String skills;

    private String portfolioLink;

    // getters
    public String getResumeUrl() {
        return resumeUrl;
    }

    public Double getExperienceYears() {
        return experienceYears;
    }

    public String getEducation() {
        return education;
    }

    public String getSkills() {
        return skills;
    }

    public String getPortfolioLink() {
        return portfolioLink;
    }
}
