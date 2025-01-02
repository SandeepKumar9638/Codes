package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoadDetails;
import com.example.demo.repo.LoadDetailsRepository;

@Service
public class LoadDetailsService {
	@Autowired
	LoadDetailsRepository ldrepo;

	public LoadDetails save(LoadDetails load) {
	
		return ldrepo.save(load);
	}

	public List<LoadDetails> getAllloads() {
		List<LoadDetails> ldlist = new ArrayList<LoadDetails>();
		ldrepo.findAll().forEach(load-> ldlist.add(load));
		
		return ldlist;
	}

	public LoadDetails getById( long id) {
		LoadDetails ldet = ldrepo.findById(id);
		return ldet;
	}
	
	public LoadDetails update(LoadDetails load) {
		return ldrepo.save(load);
		
		
	}

	public LoadDetails updatebyid(LoadDetails load, long id) {
		LoadDetails x = ldrepo.findById(id);
		if (x != null) {
			x.setKms(load.getKms());
			x = ldrepo.save(x);
			
		}
		
		return x;
	}

	public String deleteload(long id) {
		LoadDetails y = ldrepo.findById(id);
		if (y != null) {
			ldrepo.delete(y);
			return "deleted";
		}
		else {
		return null;
	}
	}
	/*
	 * public String deleteCustomer(long customerId) {
		Customer data=customerRepositry.findByCustomerId(customerId);
		if(data!=null) {
			customerRepositry.delete(data);
		return "delete successfully completed";
		}
		else {
			return "we can't delete data";
		}
	}
	 */
		
	
	
	

}

