package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Candidate;

@Repository
public interface CandidateRepository extends MongoRepository <Candidate,String>{
	 Candidate findByEnrollId(int enrollId);
	 Candidate findByName(String candidateName);

}
