package com.example.universityMg.repository;

import com.example.universityMg.model.Candidate;
import com.example.universityMg.model.Management;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagementRepository extends MongoRepository<Management, String> {

    Candidate findByCandidateId(String candidateId);
}
