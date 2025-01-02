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

import com.example.demo.entity.Applications;
import com.example.demo.service.ApplicationsService;

@RestController
public class AppliationsController {
	
	@Autowired
	ApplicationsService aservice;
	
	@PostMapping("/app")
	public Applications posting(@RequestBody Applications app) {
		return aservice.posting(app);
	}
	
	@GetMapping("/getapp")
	public List<Applications> getapps(){
		return aservice.getapps();
	}
	
	@GetMapping("/getapp/{id}")
	public Applications getappsid(@PathVariable long id) {
		return aservice.getappsid(id);
	}
	
	@PutMapping("/putapp")
	
	public Applications putapps(@RequestBody Applications app) {
		return aservice.putapps(app);
	}
	
	@PutMapping("/putapp/{id}")
	
	public Applications putappsid(@RequestBody Applications app,@PathVariable long id) {
		return aservice.putappsid(app,id);
	}
	
	@DeleteMapping("/deleteapp/{id}")
	public String deleteapps(@PathVariable long id ) {
		return aservice.deleteapps(id);
	}
}
