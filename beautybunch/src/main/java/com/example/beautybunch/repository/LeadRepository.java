package com.example.beautybunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.beautybunch.entity.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long>{

}
