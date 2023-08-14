package com.example.task.service;

import com.example.task.model.Result;
import com.example.task.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    private final ResultRepository resultRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public Result addResult(Result result) {
        return resultRepository.save(result);
    }

    public Result editResult(Result result) {
        return resultRepository.save(result);
    }

    public void deleteResult(String id) {
        resultRepository.deleteById(id);
    }

    public Result getResultById(String id) {
        return resultRepository.findById(id).orElse(null);
    }
public Result getResultByCandidateId(String candidateId)
{
    return resultRepository.findByCandidateId(candidateId);
}
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public List<Result> searchResults(String subject) {
        return resultRepository.findBySubject(subject);
    }
}