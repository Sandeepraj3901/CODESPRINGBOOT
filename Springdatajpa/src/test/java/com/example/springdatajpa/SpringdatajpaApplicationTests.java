package com.example.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdatajpa.Entity.Student;
import com.example.springdatajpa.Repo.StudentRepository;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	private StudentRepository repository;
	@Test
	void tesSaveStudent() {
	
		Student student = new Student();
		student.setId(1L);
		student.setName("Raj");
		student.setTestScore(100);
		repository.save(student);
		
		Student saveStudent = repository.findById(1L).get();
		assertNotNull(saveStudent);
	}

}
