package com.example.demo.service;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Animals;
import com.example.demo.entity.Books;
import com.example.demo.entity.Cars;
import com.example.demo.entity.Customer;
import com.example.demo.repo.AnimalsRepository;
import com.example.demo.repo.BooksRepository;
import com.example.demo.repo.CarsRepository;
import com.example.demo.repo.CustomerRepositry;

@Service

public class CustomerService {
	@Autowired
	CustomerRepositry customerRepositry;
	@Autowired
	AnimalsRepository animalsRepository;
	@Autowired
	BooksRepository booksRepository;
	@Autowired
	CarsRepository carsRepository;

	// get all details
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerRepositry.findAll().forEach(customer -> customerList.add(customer));
		return customerList;
	}

	// get specific details
	public Customer getCustomer(long customerId) {
		Customer customer = customerRepositry.findByCustomerId(customerId);
		return customer;
	}

	/* to post */
	public Customer saveOrUpdate(Customer customer) {
		try {
		String uploadDirectory= "D://imagesList";
        Path imagePath = Paths.get(uploadDirectory).resolve("25.jpg");
     byte [] data=Files.readAllBytes(imagePath);
     customer.setImage(data);
		customer = customerRepositry.save(customer);
		return customer;
	}
	catch(Exception e) {
		return null;
	}

	}
	
//	 to update all data
	
public Customer update(Customer customer) {
	customer = customerRepositry.save(customer);
		
		return customer;
	}

 // updating specific columns
public Customer updateById(Customer abc, long customerId){
	Customer x = customerRepositry.findByCustomerId(customerId);
	if (x != null) {
		x.setRegistrationFees(abc.getRegistrationFees());
		x.setCashRecieptNo(abc.getCashRecieptNo());
		x = customerRepositry.save(x);
		
	}
	
	return x;
}

	public String deleteCustomer(long customerId) {
		Customer data = customerRepositry.findByCustomerId(customerId);
		if (data != null) {
			customerRepositry.delete(data);
			return "delete successfully completed";
		} else {
			return "we can't delete data";
		}
	}

	public List<Books> getAllbooks() {
		return booksRepository.findAll();
	}

	public List<Cars> getAllCars() {
		return carsRepository.findAll();
	}

	public List<Animals> getAllAnimals() {

		return animalsRepository.findAll();
	}

	public Cars getById(long id) {
		Cars cars = carsRepository.findById(id);
		return cars;
	}

	public Books booksId(int bookId) {
		Books books = booksRepository.findBybookId(bookId);
		return books;
	}	
}
