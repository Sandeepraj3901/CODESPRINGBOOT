package com.example.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springweb.entites.products;

public interface ProductRepository extends JpaRepository<products, Integer > {

}
