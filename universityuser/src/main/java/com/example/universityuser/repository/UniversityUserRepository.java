package com.example.universityuser.repository;

import com.example.universityuser.model.UniversityUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UniversityUserRepository extends MongoRepository<UniversityUser,Integer> {

    UniversityUser findByUserName(String userName);
    List<UniversityUser> findByEmail(String email);
    Optional<UniversityUser> findById(String id);
    UniversityUser findBySeatNoAndMotherName(String seatNo, String motherName);


    UniversityUser findByMotherName(String motherName);
    UniversityUser findBySeatNo(String seatNo);
    UniversityUser findByPrn(String prn);

}
