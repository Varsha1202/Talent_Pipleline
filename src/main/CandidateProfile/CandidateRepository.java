package com.example.CandidateProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CandidateProfile.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    
}
