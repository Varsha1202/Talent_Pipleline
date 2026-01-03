package com.example.CandidateProfile;


import jakarta.persistence.*;


@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @Column(name = "candidate_id")
    private Long candidateId;

    @Column(name = "resume_url", length = 255)
    private String resumeUrl;

    @Column(name = "experience_years", precision = 3, scale = 1)
    private Double experienceYears;

    @Column(name = "education", columnDefinition = "TEXT")
    private String education;

    @Column(name = "skills", columnDefinition = "TEXT")
    private String skills;

    @Column(name = "portfolio_link", length = 255)
    private String portfolioLink;

    protected Candidate() {
        // JPA only
    }

    public Candidate(
            Long candidateId,
            String resumeUrl,
            Double experienceYears,
            String education,
            String skills,
            String portfolioLink
    ) {
        this.candidateId = candidateId;
        this.resumeUrl = resumeUrl;
        this.experienceYears = experienceYears;
        this.education = education;
        this.skills = skills;
        this.portfolioLink = portfolioLink;
        
    }

   

    public Long getCandidateId() {
        return candidateId;
    }

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



