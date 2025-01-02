package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface CustomerRepositry extends JpaRepository<Customer, Long>{
	Customer findByCustomerId(long customerId);


	

}
