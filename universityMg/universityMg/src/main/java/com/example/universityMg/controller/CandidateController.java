package com.example.universityMg.controller;


import com.example.universityMg.model.Candidate;
import com.example.universityMg.repository.ManagementRepository;
import com.example.universityMg.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    private final CandidateService candidateService;
    private final ManagementRepository managementRepository;


    @Autowired
    public CandidateController(CandidateService candidateService, ManagementRepository managementRepository) {
        this.candidateService = candidateService;
        this.managementRepository = managementRepository;
    }


    @GetMapping("/candidateResult/{candidateId}")
    public Candidate getCandidateResult(String candidateId) {
        return managementRepository.findByCandidateId(candidateId);
    }

}

