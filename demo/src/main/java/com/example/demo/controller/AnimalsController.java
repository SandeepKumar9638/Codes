package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Animals;
import com.example.demo.service.AnimalsService;    

@RestController

public class AnimalsController {
	@Autowired
	AnimalsService animalsService;
	@PostMapping("/post")
	public Animals saveAnimals(@RequestBody Animals animals) {
	 animalsService.saveOrUpdate(animals);
		 return animals;
		
	}
	@GetMapping("/getAnimals")
	public List<Animals> getAllAnimals(){
		return animalsService.getAllAnimals();
	}
	@GetMapping("/getAnimals/{animalId}")
	public Animals getAnimals(@PathVariable ("animalId") long animalId) {
		return animalsService.getAnimals(animalId);
	}
	
	@DeleteMapping("/deleteAnimals/{animalId}")
	public String deleteAnimals(@PathVariable ("animalId") long animalId){
		String animal = animalsService.deleteAnimals(animalId);
		return animal;
		
	}
	@PutMapping("/putanimals/{id}")
	public Animals updateani(@PathVariable  long animalId ) {
		return animalsService.updateani(animalId);
		
}

	
}
