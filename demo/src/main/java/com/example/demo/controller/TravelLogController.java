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
import com.example.demo.entity.Hotel;
import com.example.demo.entity.TravelLog;
import com.example.demo.service.TravelLogService;

@RestController
public class TravelLogController {

	@Autowired
	TravelLogService tlService;
	
	@PostMapping("/logs")
	public TravelLog save(@RequestBody TravelLog logs) {
		logs = tlService.save(logs);
		return logs;
	}
	
	@GetMapping("/getlogs")
	public List<TravelLog> getAll(){
		return tlService.getAll();
		
	}
	@GetMapping("/getlogs/{id}")
	public TravelLog getById(@PathVariable long id) {
		return tlService.getById(id);
	}
	@PutMapping("/putlogs/{id}")
	public TravelLog putLogs(@RequestBody TravelLog logs ,@PathVariable long id ) {
		return tlService.putLogs(logs , id);
	}
	
	@DeleteMapping("/deletelogs/{id}")
	
	public String deleteLogs(@PathVariable long id) {
		return tlService.deleteLogs(id);
	}
	
	@GetMapping("/fetchHoels")
	public List<Hotel> fetchHotel(){
	return tlService.fetchHotel();
	}
	
	@GetMapping("/fetchBikes")
	public List<Bikes> fetchBikes(){
		return tlService.fetchBikes();
	}
	
	
	
	
}

