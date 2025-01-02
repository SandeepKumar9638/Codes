package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Colleges;

@Repository

public interface CollegesRepository extends JpaRepository<Colleges, Long> {

	Colleges findByCollegeId(long collegeId);

}
