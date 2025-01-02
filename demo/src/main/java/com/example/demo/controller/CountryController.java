package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Country;
import com.example.demo.repo.CountryRepository;
import com.example.demo.service.CountryService;

@Controller
public class CountryController  {
	@Autowired
	CountryService countryService;
	@Autowired
	CountryRepository countryRepository;

	@PostMapping("/Country")
	public Country savecountry(@RequestBody Country country) {
		return countryService.savecountry(country);
	}
	@GetMapping("/getCountries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	@GetMapping("/getCountries/{id}")
	public Country getById(@PathVariable("id") long id) {
		return countryService.getById(id);

	}
	@PutMapping("/updateCountries")
	public Country update(@RequestBody Country country) {
		return countryService.update(country);
	}
	@PutMapping("/updateCountries/{id}")
	public Country updatedById(@RequestBody Country country, @PathVariable long id) {
		return countryService.updatedbyId(country , id);
	}
	@DeleteMapping("/deleteCountry/{id}")
	public String deleteById(@PathVariable long id) {
		return countryService.deleteById(id);
	}
}




