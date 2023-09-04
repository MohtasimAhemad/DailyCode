package com.example.universityuser.model;


import lombok.*;
import org.springframework.data.annotation.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {
    public static int fullMarks=100;
    private String subjectCode;
    private String subjectName;
    private double obtainedMark;
    @Transient
    private final double passmark=35;

    public int getFullMarks() {
        return fullMarks;
    }

}
