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

import com.example.demo.entity.MarriageDetails;
import com.example.demo.service.MarriageDetailsService;

@RestController
public class MarriageDetailsController {
	
	@Autowired
	MarriageDetailsService mdservice;
	
	@PostMapping("/MD")
	public MarriageDetails mdposting(@RequestBody MarriageDetails mddetails) {
		return mdservice.mdposting(mddetails);
	}
	@GetMapping("/getMD")
	public List<MarriageDetails> getAllMD(){
		return mdservice.getAllMd();
	}
	@GetMapping("/getMD/{id}")
	public MarriageDetails getById(@PathVariable long id) {
		return mdservice.getById(id);
	}
	
	@PutMapping("/putMD/{id}")
	public MarriageDetails putById( @RequestBody MarriageDetails mddetails,@PathVariable long id) {
		return mdservice.putById(mddetails,id);
	}
	@DeleteMapping("/deleteMD/{id}")
	public String deleteById( @PathVariable long id) {
		return mdservice.deleteById(id);
	}

}
