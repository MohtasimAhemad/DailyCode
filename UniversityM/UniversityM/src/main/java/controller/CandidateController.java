package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Candidate;
import service.CandidateService;

@RestController

public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;
	
	public CandidateController(CandidateService candidateService2) {
		this.candidateService=candidateService;
	}
	@GetMapping("/Candidate/{enrollId}")
	public Candidate getById(@PathVariable int enrollId) 
	{
		return candidateService.searchByEnrollId(enrollId);
	}
	@GetMapping("/Candidate/{candidateName}")
	public Candidate getByName(@PathVariable String candidateName ) 
	{
		return candidateService.searchByName(candidateName);
	}

	
}
