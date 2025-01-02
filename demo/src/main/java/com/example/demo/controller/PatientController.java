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

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping("/patients")
	public Patient postpatients(@RequestBody Patient patient) {
		return  patientService.postpatients(patient);
		
	}
	
	@GetMapping("/getpatients")
	public List<Patient> getAllPatients(){
	return patientService.getAllPatients();
}
	
	@GetMapping("/getpatient/{patientid}")
	public Patient getByPatientId(@PathVariable long patientid) {
		return patientService.getByPatientId(patientid);
	}
	
	@PutMapping("/updatepatient")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatepatient(patient);
	}
	
	@PutMapping("/updatepatient/{patientid}")
	public Patient updateById(@RequestBody Patient patient, @PathVariable long patientid) {
		return patientService.updateById(patient,patientid);
	}
	
	@DeleteMapping("/deleteatient/{patientid}")
	public String deleteById( @PathVariable long patientid) {
		return patientService.deleteById(patientid);
	}
	
}
