package com.example.universityuser.repository;

import com.example.universityuser.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository  extends MongoRepository<Result,String> {

    Result findBySeatNo(String seatNo);

}
