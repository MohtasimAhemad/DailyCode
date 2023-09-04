package com.example.universityuser.service;


import com.example.universityuser.exception.ResourceNotFoundException;
import com.example.universityuser.model.UniversityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.universityuser.repository.UniversityUserRepository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UniversityUserServiceImpl implements UniversityUserService {

    @Autowired
    private UniversityUserRepository universityUserRepository;


    @Override
    public UniversityUser addNewManagementUser(UniversityUser universityUser) {

        universityUserRepository.save(universityUser);
        return universityUser;
    }

    @Override
    public Optional<UniversityUser> getById(String id) {
        return universityUserRepository.findById(id);
    }

//    @Override
//    public Optional<UniversityUser> getByUserName(String userName) {
//        return universityUserRepository.findByUserName(userName);
//    }
    public UniversityUser getByUserName(String userName) {
        return universityUserRepository.findByUserName(userName);
    }

    @Override
    public void updateManagementUser(UniversityUser universityUser) {
        universityUserRepository.save(universityUser);

    }

    @Override
    public List<UniversityUser> getUserByEmail(String email) {
        return universityUserRepository.findByEmail(email);
    }

    public List<UniversityUser> getAllUniversityUsers() {
        return universityUserRepository.findAll();
    }



    @Override
    public void addNewCandidateForUniversity(UniversityUser universityUser) {
        universityUserRepository.save(universityUser);
    }

    public UniversityUser getBySeatNoAndMotherName(String seatNo, String motherName) {
        return universityUserRepository.findBySeatNoAndMotherName(seatNo, motherName);
    }

    @Override
    public UniversityUser getByPrn(String prn) {
        return universityUserRepository.findByPrn(prn);
    }

    @Override
    public UniversityUser getBySeatNo(String seatNo) {
        return universityUserRepository.findBySeatNo(seatNo);
    }

    @Override
    public UniversityUser getByMotherName(String motherName) {
        return universityUserRepository.findByMotherName(motherName);
    }


    @Override
    public void updateCandidateDetails(UniversityUser candidate,String seatNo) {

        UniversityUser existingUser = universityUserRepository.findBySeatNo(seatNo);

        if (existingUser != null) {
            existingUser.setFirstName(candidate.getFirstName());
            existingUser.setLastName(candidate.getLastName());
            existingUser.setFullName(candidate.getFullName());
            existingUser.setMotherName(candidate.getMotherName());
            existingUser.setPassword(candidate.getPassword());
            universityUserRepository.save(existingUser);
        } else {
            throw new ResourceNotFoundException("UniversityUser", "seatNo", seatNo);
        }    }




    private static int prnNumberCounter = 50000; // Starting PRN number counter
    private AtomicInteger seatNumberCounter = new AtomicInteger(1);
    private String generateSeatNumber() {
        int seatNumber = seatNumberCounter.getAndIncrement();
        return String.format("%06d", seatNumber); // Format as 6-digit number
    }

}
