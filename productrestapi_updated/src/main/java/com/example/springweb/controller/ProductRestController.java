package com.example.springweb.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springweb.Repository.ProductRepository;
import com.example.springweb.entites.products;

@RestController
public class ProductRestController {
	
	

	@Autowired
	ProductRepository repository;
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);
	@GetMapping("/products/")
	public List<products> getProducts()
 {
		
		return repository.findAll();
		
		
 }

	@GetMapping("/products/{id}")
	public Optional<products> getProduct(@PathVariable("id") int id)
	{
		LOGGER.info("Product find by ID:"+id);
		return repository.findById(id);
	}
	
	@PostMapping("/products/")
	public products createProduct(@RequestBody products Prod)
	{
		return repository.save(Prod);
	}
	
	@PutMapping("/products/")
	public products updateProduct(@RequestBody products Prod)
	{
		return repository.save(Prod);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id") int id)
	{
		repository.deleteById(id);
	}
	
	
}
