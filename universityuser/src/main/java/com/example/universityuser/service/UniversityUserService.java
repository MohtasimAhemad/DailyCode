package com.example.universityuser.service;


import com.example.universityuser.model.UniversityUser;

import java.util.List;
import java.util.Optional;

public interface UniversityUserService  {

    public UniversityUser addNewManagementUser(UniversityUser universityUser);
    public Optional<UniversityUser> getById(String id);
    public UniversityUser getByUserName(String userName);
    public void updateManagementUser(UniversityUser universityUser);
    public List<UniversityUser> getUserByEmail(String email);
    public void addNewCandidateForUniversity(UniversityUser universityUser);
    public UniversityUser getByPrn(String prn);
    public UniversityUser getBySeatNo(String seatNo);
    public UniversityUser getByMotherName(String motherName);
    public void updateCandidateDetails(UniversityUser candidate,String seatNo);
    List<UniversityUser> getAllUniversityUsers();

}
