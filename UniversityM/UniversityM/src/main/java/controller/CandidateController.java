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
	
	@GetMapping("/Candidate/{enrollId}")
	public Candidate getById(@PathVariable int enrollId) 
	{
		return candidateService.searchByEnrollId(enrollId);
	}
	@GetMapping("/Candidate/{enrollId}")
	public Candidate getByName(@PathVariable String subName ) 
	{
		return candidateService.searchByName(subName);
	}

	
}
