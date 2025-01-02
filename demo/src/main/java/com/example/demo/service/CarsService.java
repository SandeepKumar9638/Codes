package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cars;
import com.example.demo.repo.CarsRepository;

@Service
public class CarsService {
	@Autowired
	CarsRepository carsRepository;

	
	// to post
	public Cars savecars(Cars cars) {
		cars=carsRepository.save(cars);
		 return cars;
	}

	// to get all
	public List<Cars> getAllCars() {
		List<Cars> carsList = new ArrayList<Cars>();
		carsRepository.findAll().forEach(cars -> carsList.add(cars));
		
		return carsList;
	}

	// to get specific 
	public Cars getById(long id) {
		Cars cars =carsRepository.findById(id);
		
		return cars;
	}
	// to update 
	 public Cars update(Cars cars) {
		 return carsRepository.save(cars);
		 
	 }
	 // to update by id
	 public Cars updateById(Cars cars, long id) {	
		Cars car = carsRepository.findById(id);
		if (car != null) {
			car.setBrand(cars.getBrand());
			car=carsRepository.save(car);
			return car;
		}
		else {
			return null ;
		}
		
	}
	//to delete  
	 public String deleteById(long id) {
		 Cars ca = carsRepository.findById(id);
		 if (ca!= null) {
			carsRepository.delete(ca);
			 return "deleted";
		 }
		
		return "not deleted";
	}	 
}
