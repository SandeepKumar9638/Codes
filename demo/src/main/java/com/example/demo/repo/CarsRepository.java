package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {
	Cars findById(long  id);

}
