package com.example.beautybunch.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.beautybunch.entity.Lead;
import com.example.beautybunch.repository.LeadRepository;




@RestController

public class LeadController {
	
	@Autowired
	LeadRepository leadRepository;	
	
	@CrossOrigin
	@PostMapping(path = "/api/lead")
	public ResponseEntity<Lead> saveLead(@RequestBody Lead lead) {
		Lead savedLead = leadRepository.save(lead);

		return new ResponseEntity<>(leadRepository.save(lead),HttpStatus.CREATED);
	}
	@GetMapping(path = "/api/leads")
	public ResponseEntity<List<Lead>> getLeads() {
      return new ResponseEntity<>(leadRepository.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/api/leads/{id}")
	public ResponseEntity<Lead> getStudent(@PathVariable long id, Object Optional) {
      Optional<Lead> lead = leadRepository.findById(id);
	if(lead.isPresent()) {
		return new ResponseEntity<>(lead.get(),HttpStatus.OK);
	}
	else {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	
}

