package com.example.universityuser.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "result")
public class Result {
    @Id
    private String id;
    private String seatNo;
    private List<Subject> subject;
    private double percentage;


    public Result(String seatNo, List<Subject> subject) {
        this.seatNo = seatNo;
        this.subject = subject;
        this.calculatePercentage();
    }




    public void calculatePercentage() {
        double totalObtainedMarks = subject.stream()
                .mapToDouble(Subject::getObtainedMark)
                .sum();
        double totalFullMarks = subject.size() * Subject.fullMarks;

        if (totalFullMarks > 0) {
            percentage = (totalObtainedMarks / totalFullMarks) * 100;
        } else {
            percentage = 0;
        }
    }

}
