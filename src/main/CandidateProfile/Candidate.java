package com.example.demo.CandidateProfile;

import java.time.Instant;

import jakarta.persistence.*;


@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @Column(name = "candidate_id")
    private Long candidateId;

    @Column(name = "resume_url", length = 255)
    private String resumeUrl;

    @Column(name = "experience_years")
    private Double experienceYears;

    @Column(name = "education", columnDefinition = "TEXT")
    private String education;

    @Column(name = "skills", columnDefinition = "TEXT")
    private String skills;

    @Column(name = "portfolio_link", length = 255)
    private String portfolioLink;
    
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;



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
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
       
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
    
    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

   
}


