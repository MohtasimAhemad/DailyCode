package com.example.universityMg.controller;

import com.example.universityMg.model.Candidate;
import com.example.universityMg.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management")
public class ManagementController {
    private final ManagementService managementService;

    @Autowired
    public ManagementController(ManagementService managementService) {
        this.managementService = managementService;
    }

    @GetMapping("/results")
    public List<Candidate> getAllResults() {
        return managementService.getAllResults();
    }

    @PostMapping("/addResults")
    public Candidate addResult(@RequestBody Candidate candidate) {
        return managementService.addResult(candidate);
    }

    @GetMapping("/results/{candidateId}")
    public Candidate getResultById(@PathVariable String candidateId) {
        return managementService.getResultById(candidateId);
    }

    @PutMapping("/updateResults/{candidateId}")
    public Candidate updateResult(@PathVariable String candidateId, @RequestBody Candidate candidate) {
        return managementService.updateResult(candidateId, candidate);
    }

    @DeleteMapping("/deleteResults/{candidateId}")
    public void deleteResult(@PathVariable String candidateId) {
        managementService.deleteResult(candidateId);
    }
}
