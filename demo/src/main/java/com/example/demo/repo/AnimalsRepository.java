package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Animals;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {

	Animals findByAnimalId(long animalId);

	
	
	/*
	 * @Override default Optional<Animals> findById(Long id) { // TODO
	 * Auto-generated method stub return null; }
	 */
	

}
