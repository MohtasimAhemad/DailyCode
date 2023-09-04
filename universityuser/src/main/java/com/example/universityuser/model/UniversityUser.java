package com.example.universityuser.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "universityuser")
public class UniversityUser  {


    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String motherName;

    private String userName;
    private String email;
    private String seatNo;
    private String password;
    private String phoneNumber;

    private String prn;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String aadhaarNo;
    private String studentCollageName;
    private String course;
    private String branch;
    private String role;
    private String year;
    private Address address;

    @DBRef
    private Result result;



}
