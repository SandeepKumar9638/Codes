package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PracThri;
import com.example.demo.repo.PracThrirepo;

@Service
public class PracThriServ {
	@Autowired
	PracThrirepo pracThrirepo;
	public PracThri posting(PracThri pracThri) {
	
		return pracThrirepo.save(pracThri);
	}
	
	

}
