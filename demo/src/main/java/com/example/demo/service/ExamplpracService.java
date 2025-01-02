package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Examplprac;
import com.example.demo.repo.ExamplpracRepo;

@Service
public class ExamplpracService {

	@Autowired
	ExamplpracRepo examplpracRepo;

	public long sadposting(Examplprac examplprac) {
		return examplpracRepo.save(examplprac).getSandeepId();

	}

	public List<Examplprac> sadsposting() {
		return examplpracRepo.findAll();

	}

	public Examplprac sadspostings(long sandeepId) {
		
		return examplpracRepo.findBysandeepId(sandeepId);
	}

}
