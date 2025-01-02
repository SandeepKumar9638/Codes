package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
import com.example.demo.repo.CountryRepository;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryrepository;

	// to post 
	public Country savecountry(Country country) {
		
		country =  countryrepository.save(country);
		return country;
	}


	// get all countries
	public List<Country> getAllCountries() {
		List<Country> countrylist = new ArrayList<Country>();
		countryrepository.findAll().forEach(country -> countrylist.add(country));
		return countrylist;
	}
  // get by id
	public Country getById(long id) {
		Country country = countryrepository.findById(id);
		
		return country;
	}

  // update 
	public Country update(Country country) {
		
		return countryrepository.save(country);
	}

 // update a specific column
	public Country updatedbyId(Country country, long id) {
		Country count = countryrepository.findById(id);
		if ( count != null) {
			count.setDistrict(country.getDistrict());
			countryrepository.save(count);
			return (count);
			
		}
		else {
		
		return null;
	}
	}
	
	// deletes  entire row
	public String deleteById(long id) {
		Country count = countryrepository.findById(id);
		if ( count != null) {
			countryrepository.delete(count);
			return "deleted" ;
		}
		else {
			return null;
		}
		
	}
}
