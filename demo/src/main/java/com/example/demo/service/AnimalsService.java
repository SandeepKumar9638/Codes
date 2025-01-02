package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Animals;
import com.example.demo.repo.AnimalsRepository;

@Service
public class AnimalsService {
@Autowired
AnimalsRepository animalsRepository;
//post
public void saveOrUpdate(Animals animals) {
	animalsRepository.save(animals);
	
}
// get all
public List<Animals> getAllAnimals() {
	List<Animals> animals = new ArrayList<Animals> ();
	animalsRepository.findAll().forEach(animals1 -> animals.add(animals1));
	
	return animals;
}
// get specific animal by id
public Animals getAnimals(long animalId) {
	Animals animals = animalsRepository.findByAnimalId(animalId);
	return animals;
}

public String deleteAnimals(long animalId) {
	Animals data = animalsRepository.findByAnimalId(animalId);
	if (data != null) {
		animalsRepository.delete(data);
		return "deleted";	
	}
	else {
	return "not deleted";
}
}
public Animals updateani(long animalId) {
	Animals ani = animalsRepository.findByAnimalId(animalId);
	if (ani != null) {
		ani.setAnimalCost(ani.getAnimalCost());
		return animalsRepository.save(ani);
	}
	return null;
	
}



}
