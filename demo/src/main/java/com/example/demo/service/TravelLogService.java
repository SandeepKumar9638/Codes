package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bikes;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.TravelLog;
import com.example.demo.repo.BikesRepository;
import com.example.demo.repo.HotelRepository;
import com.example.demo.repo.TravelLogRepository;

@Service
public class TravelLogService {
	
	@Autowired
	TravelLogRepository tlrepo;
	
	@Autowired
	HotelRepository hrepo;
	
	@Autowired
	BikesRepository brepo;

	public TravelLog save(TravelLog logs) {
		logs = tlrepo.save(logs);
		return logs;
		
	}

	public List<TravelLog> getAll() {
		 List<TravelLog> tlist = new ArrayList<TravelLog>();
		 tlrepo.findAll().forEach(logs -> tlist.add(logs));
	
		return tlist;
	}

	public TravelLog getById(long id) {
		TravelLog tl = tlrepo.findById(id);
		return tl;
	}

	public TravelLog putLogs(TravelLog logs, long id) {
		TravelLog x = tlrepo.findById(id);
		if (x != null) {
			x.setDay(logs.getDay());
			x = tlrepo.save(x);
		}
		return x;
	}

	public String deleteLogs(long id) {
		TravelLog y = tlrepo.findById(id);
		if (y != null) {
			tlrepo.delete(y);;
			return "deleted";
		}else {
		return null;
	}
	}

	public List<Hotel> fetchHotel() {
	    return   hrepo.findAll();
		
	}

	public List<Bikes> fetchBikes() {
		
		return brepo.findAll();
	}

}
