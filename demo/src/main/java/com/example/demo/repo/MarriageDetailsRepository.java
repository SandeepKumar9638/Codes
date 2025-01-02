package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MarriageDetails;

@Repository
public interface MarriageDetailsRepository extends JpaRepository<MarriageDetails, Long> {
	MarriageDetails findById(long id);

}
