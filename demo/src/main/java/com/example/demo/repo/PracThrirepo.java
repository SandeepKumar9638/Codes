package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PracThri;

@Repository
public interface PracThrirepo extends JpaRepository<PracThri, Integer>{

}
