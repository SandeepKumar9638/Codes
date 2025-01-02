package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Examplprac;
import com.example.demo.service.ExamplpracService;

import dto.ExamplpracDto;

@RestController
public class ExamplpracController {
	@Autowired
	ExamplpracService examplpracService;

	@PostMapping("/posting")
	public ResponseEntity<?> sadposting(@RequestBody Examplprac examplprac) {

		long sandeepId = examplpracService.sadposting(examplprac);
		return ResponseEntity.status(HttpStatus.OK).body(sandeepId + " is Created");

	}
	
	@GetMapping("/get")
	public ResponseEntity<?> sadsposting(){
		
		List<Examplprac> status= examplpracService.sadsposting();
		
		ExamplpracDto ep = new ExamplpracDto(status,"Data vachindhi");
		
		return ResponseEntity.status(HttpStatus.OK).body(ep);
	}
	
	@GetMapping("/get/{sandeepId}")
	
	public Examplprac sadspostings(@PathVariable long sandeepId){
		return examplpracService.sadspostings(sandeepId);
		
	}

}
