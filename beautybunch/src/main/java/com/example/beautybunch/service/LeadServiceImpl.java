package com.example.beautybunch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beautybunch.entity.Lead;
import com.example.beautybunch.repository.LeadRepository;


@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepository;
	
	@Override
	public boolean saveLead(Lead lead) {
		// TODO Auto-generated method stub
		
	
		return false;
	}
}


