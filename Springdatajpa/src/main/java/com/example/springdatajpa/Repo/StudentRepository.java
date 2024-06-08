package com.example.springdatajpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.Entity.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {

}
