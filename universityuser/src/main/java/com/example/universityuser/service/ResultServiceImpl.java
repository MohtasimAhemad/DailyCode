package com.example.universityuser.service;

import com.example.universityuser.model.Result;
import com.example.universityuser.model.Subject;
import com.example.universityuser.model.UniversityUser;
import com.example.universityuser.repository.ResultRepository;
import com.example.universityuser.repository.UniversityUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private UniversityUserRepository universityUserRepository;

    public void calculatePercentage(Result result) {
        List<Subject> subjects = result.getSubject();
        double totalObtainedMarks = subjects.stream()
                .mapToDouble(Subject::getObtainedMark)
                .sum();
        double totalFullMarks = subjects.size() * subjects.get(0).getFullMarks();

        if (totalFullMarks > 0) {
            result.setPercentage((totalObtainedMarks / totalFullMarks) * 100);
        } else {
            result.setPercentage(0);
        }
    }

    @Override
    public void addResult(Result result) {

        UniversityUser user = universityUserRepository.findBySeatNo(result.getSeatNo());
        if (user != null) {
            result.calculatePercentage();
            resultRepository.save(result);
            user.setResult(result);
            universityUserRepository.save(user);
        }
    }


    @Override
    public Result getResultBySeatNo(String seatNo) {
        return resultRepository.findBySeatNo(seatNo);
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }


}
