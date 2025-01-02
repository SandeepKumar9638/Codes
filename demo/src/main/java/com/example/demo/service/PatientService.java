package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public Patient postpatients(Patient patient) {
	
	patient= patientRepository.save(patient);
	return patient;
	}

	public List<Patient> getAllPatients() {
		List<Patient> plist = new ArrayList<Patient>();
		patientRepository.findAll().forEach(patient ->plist.add(patient));
		return plist;
	}

	public Patient getByPatientId(long patientid) {
		Patient p = patientRepository.findById( patientid);
		return p;
	}

	public Patient updatepatient(Patient patient) {
		patient = patientRepository.save(patient);
		return patient;
	}

	public Patient updateById(Patient patient, long patientid) {
		Patient x = patientRepository.findById(patientid);
		if(x != null) {
			x.setPatientEmail(x.getPatientEmail());
			return patientRepository.save(x);
			
		}
		return null;
	}

	public String deleteById(long patientid) {
		Patient y = patientRepository.findById(patientid);
		if (y != null) {
			patientRepository.delete(y);
			return "deleted";
		}
		else {
			return"cant delete";		}

	}
}
