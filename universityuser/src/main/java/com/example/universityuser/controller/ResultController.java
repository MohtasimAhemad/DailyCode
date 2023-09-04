package com.example.universityuser.controller;

import com.example.universityuser.model.Result;
import com.example.universityuser.service.ResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
@CrossOrigin(origins = "*")
public class ResultController {

    @Autowired
    private ResultServiceImpl resultServiceImpl;

    @PostMapping("/addResult")
    public void addResult(@RequestBody Result result)
    {
        resultServiceImpl.addResult(result);
    }

    @GetMapping("/allResult")
    public List<Result> getAllResult()
    {
        return resultServiceImpl.getAllResults();
    }

    @GetMapping("/resultBySeatNo/{seatNo}")
    public Result getResultBySeatNo(@PathVariable String seatNo)
    {
        return resultServiceImpl.getResultBySeatNo(seatNo);
    }

}
