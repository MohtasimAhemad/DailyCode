package model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "candidatedb")
public class Candidate {

	private int enrollId;
	private String candidateName;
	private List<String> subjects;
	private String score;
	
	
	public Candidate(int enrollId, String candidateName, List<String> subjects, String score) {
	this.enrollId = enrollId;
	this.candidateName = candidateName;
	this.subjects = subjects;
	this.score = score;
}
	public int getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Candidate [enrollId=" + enrollId + ", candidateName=" + candidateName + ", subjects=" + subjects
				+ ", score=" + score + "]";
	}
	
}


