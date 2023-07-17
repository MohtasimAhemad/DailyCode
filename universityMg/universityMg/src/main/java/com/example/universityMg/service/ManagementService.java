package com.example.universityMg.service;



import com.example.universityMg.model.Candidate;
import com.example.universityMg.model.Management;
import com.example.universityMg.repository.CandidateRepository;
import com.example.universityMg.repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {
    private final CandidateRepository candidateRepository;
    private final ManagementRepository managementRepository;


    @Autowired
    public ManagementService(CandidateRepository candidateRepository, ManagementRepository managementRepository) {
        this.candidateRepository = candidateRepository;
        this.managementRepository = managementRepository;
    }

    public List<Candidate> getAllResults() {
        return candidateRepository.findAll();
    }

    public Candidate addResult(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public Candidate getResultById(String candidateId) {
        return candidateRepository.findByCandidateId(candidateId);
    }

    public Candidate updateResult(String candidateId, Candidate updatedCandidate) {
        Candidate candidate = candidateRepository.findByCandidateId(candidateId);
        if (candidate != null) {
            candidate.setResult(updatedCandidate.getResult());
            return candidateRepository.save(candidate);
        }
        return null;
    }

    public void deleteResult(String candidateId) {
        candidateRepository.deleteById(candidateId);
    }

    // Utility method to check if the user is part of management
//    private boolean isCurrentUserManagement() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String currentUsername = authentication.getName();
//        Management management = managementRepository.findByUsername(currentUsername);
//        return management != null;
//    }
}

