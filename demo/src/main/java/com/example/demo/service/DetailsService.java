package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Details;
import com.example.demo.repo.DetailsRepository;

@Service
public class DetailsService {
	@Autowired
	DetailsRepository  detailsRepository;


	
	public Details saveOrUpadte(Details details) {
		 details = detailsRepository.save(details);
		return details;
	}

	
	public List<Details> getAllDetails() {
		List<Details> detailslist = new ArrayList<Details>();
		detailsRepository.findAll().forEach(details -> detailslist.add(details));
		return detailslist;
	}

	public Details getById(long id) {
		Details details = detailsRepository.findById(id);
		return details;
	}

	public Details updateData(Details details) {
		return  detailsRepository.save(details);
	}
	

	public String deleteById(long id) {
		Details d = detailsRepository.findById(id);
		if (d != null) {
			return "deleted";
		}
		else {
			return "not deleted";
		}
		}
	

}
