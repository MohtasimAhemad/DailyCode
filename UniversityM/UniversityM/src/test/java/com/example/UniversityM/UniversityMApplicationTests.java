package com.example.UniversityM;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import model.Candidate;
import repository.CandidateRepository;
import org.mockito.Mock;
import java.util.Arrays;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UniversityMApplicationTests {

    @Mock
    private CandidateRepository candidateRepository;
 

    @Test
	public void searchByName1() {
    	Candidate cand1 = new Candidate(123, "Mohtasim", Arrays.asList("JAVA", "C++"), "188");
		String name ="Mohtasim";
		when(candidateRepository.findByName(name)).thenReturn(cand1);
	}
   
    @Test
    public void searchById()
    {
    	Candidate cand2 = new Candidate(101, "Paya;", Arrays.asList("DSA","OOPs"), "172");
    	int id=101;
    	when(candidateRepository.findByEnrollId(101)).thenReturn(cand2);
    }
}


