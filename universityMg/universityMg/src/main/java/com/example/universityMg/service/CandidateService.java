package com.example.universityMg.service;

import com.example.universityMg.model.Candidate;
import com.example.universityMg.repository.CandidateRepository;
import com.example.universityMg.repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    private final CandidateRepository candidateRepository;
    private final ManagementRepository managementRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository, ManagementRepository managementRepository) {
        this.candidateRepository = candidateRepository;
        this.managementRepository = managementRepository;
    }

    public Candidate getCandidateResult(String candidateId) {
        return managementRepository.findByCandidateId(candidateId);
    }
}
