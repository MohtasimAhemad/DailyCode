package com.example.task.repository;

import com.example.task.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ResultRepository extends MongoRepository<Result, String> {
    List<Result> findBySubject(String subject);
    Result findByCandidateId(String candidateId);
}