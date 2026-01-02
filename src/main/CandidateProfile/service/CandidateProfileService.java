package com.example.CandidateProfile.service;

import com.example.CandidateProfile.dto.CandidateProfileResponse;
import com.example.CandidateProfile.dto.CreateCandidateProfileRequest;
import com.example.CandidateProfile.dto.UpdateCandidateProfileRequest;

public interface CandidateProfileService {

    CandidateProfileResponse createProfile(CreateCandidateProfileRequest request);

    CandidateProfileResponse getProfileByCandidateId(Long candidateId);

    CandidateProfileResponse updateProfile(
            Long candidateId,
            UpdateCandidateProfileRequest request
    );
}
