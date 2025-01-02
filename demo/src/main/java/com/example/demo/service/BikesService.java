package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bikes;
import com.example.demo.repo.BikesRepository;

@Service
public class BikesService {
	@Autowired
	BikesRepository bikesRepository;
	
// post
	public Bikes saveOrUpdate(Bikes bikes) {
		bikesRepository.save(bikes);
		
		return bikes;
	}
//get all 
	public List<Bikes> getAllBikes() {
		List<Bikes> BikesList = new ArrayList<Bikes>();
		bikesRepository.findAll().forEach(bikes -> BikesList.add(bikes));

		return BikesList;
	} 

	//get specific
	public Bikes getBikes(long id) {
		Bikes bikes = bikesRepository.findById(id);
		
		return bikes;
	}

	// update
	public void update(Bikes bikes, long id) {
		bikesRepository.save(bikes);
	}
	// delete specific  
	
	public String deleteBikes(long id) {
		Bikes data = bikesRepository.findById(id);
		if (data != null) {
			bikesRepository.delete(data);
			return "deleted";
		}
		else {
			return "not deleted";			
			
		}
		
	}
}
