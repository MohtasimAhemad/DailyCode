package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.Candidate;
import repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;
	
	
	public CandidateService(CandidateRepository candidateRepository) {
		this.candidateRepository=candidateRepository;
	}

	public Candidate searchByEnrollId(int enrollId) {
		return  candidateRepository.findByEnrollId(enrollId);
	}
	
	public Candidate searchByName(String candidateName)
	{
		return candidateRepository.findByName(candidateName);
	}
	
	
}
