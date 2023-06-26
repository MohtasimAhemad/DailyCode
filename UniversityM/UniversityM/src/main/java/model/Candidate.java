package model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "candidatedb")
public class Candidate {

	private int enrollId;
	private String subName;
	private String score;
	
	
	
	public Candidate(int enrollId, String subName, String score) {
		this.enrollId = enrollId;
		this.subName = subName;
		this.score = score;
	}
	public int getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Candidate [enrollId=" + enrollId + ", subName=" + subName + ", score=" + score + "]";
	}
	
	
}
