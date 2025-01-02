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

import com.example.demo.entity.LoadDetails;
import com.example.demo.service.LoadDetailsService;

@RestController
public class LoadDetailsController {
 
	@Autowired
	LoadDetailsService ldservice;
	
	@PostMapping("/load")
	public LoadDetails  save(@RequestBody LoadDetails load) {
		load = ldservice.save(load);
		return load; 
	}
	
	@GetMapping("/getload")
	public List<LoadDetails> getAllloads(){
		return ldservice.getAllloads();
	}
	
	@GetMapping("/getload/{id}")
	public LoadDetails getById(@PathVariable long id) {
		return ldservice.getById(id);
	}
	
	@PutMapping("/updateload")
	public LoadDetails update(@RequestBody LoadDetails load) {
		 return ldservice.update(load);
		
	}
	
	@PutMapping("/updateload/{id}")
	public LoadDetails updatebyid(@RequestBody LoadDetails load , @PathVariable long id) {
		return ldservice.updatebyid(load,id);
	}
	@DeleteMapping("/delteload/{id}")
	public String deleteload(@PathVariable long id) {
		
		String y = ldservice.deleteload(id) ;
		return y;
	}
	/*
	 * @DeleteMapping("/deleteCustomer/{customerId}")
	public String  deleteCustomer(@PathVariable long customerId)   {
		String data=customerService.deleteCustomer(customerId);
		return data;
	 */
}
