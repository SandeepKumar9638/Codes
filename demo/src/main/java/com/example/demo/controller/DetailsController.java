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

import com.example.demo.entity.Details;
import com.example.demo.service.DetailsService;

@RestController      
public class DetailsController {
	@Autowired
	DetailsService detailsService;

	
	@PostMapping("/Details")
	public Details saveOrUpdate(@RequestBody Details details) {
		return detailsService.saveOrUpadte(details);
		
		
	}
	@GetMapping("/getDetails")
	public  List<Details> getAllDetails(){
		return detailsService.getAllDetails();
	}
	@GetMapping("/getDetails/{id}")
	public Details getById(@PathVariable ("id") long id) {
		return detailsService.getById(id);
		
	}
	@PutMapping("/updateDetails")
	public Details updateData(@RequestBody Details details) {
		return  detailsService.updateData(details);
		 
	}
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteById(@PathVariable ("id") long id) {
		return detailsService.deleteById(id);
		}

}
