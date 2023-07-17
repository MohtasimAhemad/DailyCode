package com.example.universityMg.repository;

import com.example.universityMg.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
    Candidate findByCandidateId(String candidateId);
}
