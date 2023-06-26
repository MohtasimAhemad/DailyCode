package service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import model.Candidate;
import repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;
	
	
	public Candidate searchByEnrollId(int enrollId) {
		return  candidateRepository.findByEnrollId(enrollId);
	}
	
	public Candidate searchByName(String subName)
	{
		return candidateRepository.findByName(subName);
	}
	
	
}
