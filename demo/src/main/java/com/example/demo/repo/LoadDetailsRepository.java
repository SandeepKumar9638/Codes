package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LoadDetails;
@Repository
public interface LoadDetailsRepository extends JpaRepository<LoadDetails, Long> {
	
	LoadDetails findById(long id);

}
