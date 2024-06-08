package com.example.springdatajpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id	
	private Long Id;
	private String Name;
	private int TestScore;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTestScore() {
		return TestScore;
	}
	public void setTestScore(int testScore) {
		TestScore = testScore;
	}
	

}
