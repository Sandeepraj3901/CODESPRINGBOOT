package com.example.springweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springweb.Repository.ProductRepository;
import com.example.springweb.entites.products;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping("/products/")
	public List<products> getProducts()
 {
		return repository.findAll();
		
		
 }

	@GetMapping("/products/{id}")
	public Optional<products> getProduct(@PathVariable("id") int id)
	{
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
