package com.example.universityuser.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String pincode;
}
