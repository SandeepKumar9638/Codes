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

import com.example.demo.entity.Colleges;
import com.example.demo.service.CollegesService;

@RestController 

public class CollegesController {
	
	@Autowired
	CollegesService cservice;
	
	@PostMapping("/colleges")
	public Colleges postcolleges(@RequestBody Colleges colleges) {
		return cservice.postcolleges(colleges);
	}

	@GetMapping("/getcolleges")
	public List<Colleges> getColleges() {
		return cservice.getcollegs();
	}
	
	@GetMapping("/geetColleges/{collegeId}")
	public Colleges getById(@PathVariable long collegeId) {
		return cservice.getById(collegeId);
	}
	
	@PutMapping("/putcolleges/{collegeId}")
	public Colleges putcolleges( @RequestBody Colleges colleges,@PathVariable long collegeId) {
		return cservice.putcolleges(colleges , collegeId);
	}
	
	@DeleteMapping("/deletecolleges/{collegeId}")
	public String deleteColleges( @PathVariable long collegeId) {
		return cservice.deleteColleges(collegeId);
	}
	
}
