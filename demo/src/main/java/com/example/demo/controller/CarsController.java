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

import com.example.demo.entity.Cars;
import com.example.demo.repo.CarsRepository;
import com.example.demo.service.CarsService;

@RestController
public class CarsController {
	@Autowired
	CarsService carsService;
	@Autowired
	CarsRepository carsRepository;
	
	@PostMapping ("/Cars")
	public Cars savecars(@RequestBody  Cars cars) {
		return carsService.savecars(cars);
	}
	@GetMapping("/getCars")
	public List<Cars> getAllCars() {
		return carsService.getAllCars();
	}
	@GetMapping("/getCars/{id}")
	public Cars getById(@PathVariable ("id") Long id) {
		return carsService.getById(id);
	}
	@PutMapping("/updateCars")
	public Cars update(@RequestBody Cars cars) {
		cars = carsService.update(cars);
		return cars;
}
	@PutMapping("/updateCars/{id}")
	public Cars updateById(@RequestBody Cars cars,@PathVariable 
			Long id) {
		return carsService.updateById(cars,id);
		
	}
	
	@DeleteMapping("/deleteCars/{id}")
	public String deleteById(@PathVariable ("id") Long id) {
		return carsService.deleteById(id);
	}
}