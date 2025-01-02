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

import com.example.demo.entity.Animals;
import com.example.demo.entity.Books;
import com.example.demo.entity.Cars;
import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepositry;
import com.example.demo.service.CustomerService;

@RestController

public class CustomerController {
	@Autowired

	CustomerService customerService;

	@PostMapping("/Customer")
	public Customer saveOrUpdate(@RequestBody Customer customer) {
		customer = customerService.saveOrUpdate(customer);
		return customer;
	}

	@GetMapping("/getCustomer")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/getCustomer/{customerId}")
	public Customer getCustomer(@PathVariable long customerId) {
		return customerService.getCustomer(customerId);
	}

	@PutMapping("/updateCustomer")
	public Customer update(@RequestBody Customer abc) {
		abc = customerService.update(abc);
		return abc;
	}

	@PutMapping("updating/{customerId}")
	public Customer updateById(@RequestBody Customer abc, @PathVariable long customerId) {
		return customerService.updateById(abc, customerId);
	}

	@DeleteMapping("/deleteCustomer/{customerId}")
	public String deleteCustomer(@PathVariable long customerId) {
		String data = customerService.deleteCustomer(customerId);
		return data;

	}

	@GetMapping("/fetchBooks")
	public List<Books> getAllBooks() {
		return customerService.getAllbooks();
	}

	@GetMapping("/fetchCars")
	public List<Cars> getAllcars() {
		return customerService.getAllCars();
	}

	@GetMapping("/fetchAnimals")
	public List<Animals> getAllAnimals() {
		return customerService.getAllAnimals();
	}

	@GetMapping("/fetchcars/{id}")
	public Cars getById(@PathVariable long id) {
		return customerService.getById(id);

	}

	@GetMapping("/fetchbooks/{bookId}")
	public Books booksId(@PathVariable int bookId) {
		return customerService.booksId(bookId);

	}
}
