package com.example.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springweb.entites.product;

public interface ProductRepository extends JpaRepository<product, Integer > {

}
