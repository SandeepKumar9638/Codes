package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bikes;

public interface BikesRepository extends JpaRepository<Bikes, Long> {
	Bikes findById(long id);
}
