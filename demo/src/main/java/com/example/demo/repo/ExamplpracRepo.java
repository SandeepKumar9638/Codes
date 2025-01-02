package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Examplprac;

public interface ExamplpracRepo extends JpaRepository<Examplprac, Long> {

	Examplprac findBysandeepId(long sandeepId);

}
