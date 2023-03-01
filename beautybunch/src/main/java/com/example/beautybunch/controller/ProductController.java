package com.example.beautybunch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beautybunch.entity.Product;
import com.example.beautybunch.repository.ProductRepo;


	
@RestController
public class ProductController {
	@Autowired
	ProductRepo productRepo;	
	@PostMapping("/api/products")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productRepo.save(product),HttpStatus.CREATED);
	}
	@GetMapping("/api/products")
	public ResponseEntity<List<Product>> getStudents() {
      return new ResponseEntity<>(productRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/api/products/{id}")
	public ResponseEntity<Product> getStudent(@PathVariable long id, Object Optional) {
      Optional<Product> product = productRepo.findById(id);
	if(product.isPresent()) {
		return new ResponseEntity<>(product.get(),HttpStatus.OK);
	}
	else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
		
	
}
}
