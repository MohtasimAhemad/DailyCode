package com.example.universityMg.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidatesDb")
public class Candidate {

    @Id
    private String candidateId;
    private String name;
    private String result;

    public Candidate(String candidateId, String name, String result) {
        this.candidateId = candidateId;
        this.name = name;
        this.result = result;
    }

    public String getId() {
        return candidateId;
    }

    public void setId(String id) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
