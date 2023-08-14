package com.example.task.controller;

import com.example.task.model.Result;
import com.example.task.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/results")
public class ResultController {
    private final ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Result addResult(@RequestBody Result result) {
        return resultService.addResult(result);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public Result editResult(@PathVariable String id, @RequestBody Result result) {
        Result existingResult = resultService.getResultById(id);
        if (existingResult != null) {
            existingResult.setSubject(result.getSubject());
            existingResult.setMarks(result.getMarks());
            return resultService.editResult(existingResult);
        }
        return null;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable String id) {
        resultService.deleteResult(id);
    }


    @PreAuthorize("hasAnyRole('ADMIN', 'CANDIDATE')")
    @GetMapping("/candidate/{candidateId}")
    public Result getResultByCandidateId(@PathVariable String candidateId) {
        return resultService.getResultByCandidateId(candidateId);
    }
//    @PreAuthorize("hasAnyRole('ADMIN', 'CANDIDATE')")
//    @GetMapping("/{id}")
//    public Result getResultById(@PathVariable String id) {
//        return resultService.getResultById(id);
//    }
    @PreAuthorize("hasAnyRole('ADMIN', 'CANDIDATE')")
    @GetMapping("/{id}")
    public Result getResultById(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("User: " + authentication.getName() + " | Authorities: " + authentication.getAuthorities());

        return resultService.getResultById(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

}
