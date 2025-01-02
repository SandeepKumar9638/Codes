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

import com.example.demo.entity.Bikes;
import com.example.demo.service.BikesService;

@RestController
public class BikesController {
	@Autowired
	BikesService bikesService;
	
	
	@PostMapping("/Bikes")
	public Bikes saveOrUpdate(@RequestBody Bikes bikes) {
	bikes = bikesService.saveOrUpdate(bikes);
		return bikes;
		}
	@GetMapping("/getAllBikes")
	public List<Bikes> getAllBikes(){
		return bikesService.getAllBikes();
	}
	@GetMapping("/getBikes/{id}")
	public Bikes getBikes(@PathVariable("id") long id ) {
		return bikesService.getBikes(id);
		
	}
	@PutMapping("/updateBikes")
	public Bikes updateBikesData(@RequestBody Bikes bikes) {
		bikes = bikesService.saveOrUpdate(bikes);
		return bikes;
	}
	@DeleteMapping("/deleteBikes/{id}")
	public String deleteBikes(@PathVariable("id") long id) {
		String b = bikesService.deleteBikes(id);
		return b ;
		
	}
}
