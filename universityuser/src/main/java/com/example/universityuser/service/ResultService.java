package com.example.universityuser.service;

import com.example.universityuser.model.Result;
import java.util.List;

public interface ResultService {

public  void addResult(Result result);
public Result getResultBySeatNo(String seatNo);
    List<Result> getAllResults();

}
