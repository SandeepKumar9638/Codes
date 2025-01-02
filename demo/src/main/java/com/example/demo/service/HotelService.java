package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hotel;
import com.example.demo.repo.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hRepository;
	

	public Hotel post(Hotel hotel) {
		hotel = hRepository.save(hotel);
		return hotel;
	}

	public List<Hotel> getAllhotel() {
		List<Hotel> hlist = new ArrayList<Hotel>();
		hRepository.findAll().forEach(hotel -> hlist.add(hotel));
		return hlist;
	}

	public Hotel getByprice(double price) {
		Hotel hotel = hRepository.findByprice(price);
		return hotel;
	}

	public Hotel put(Hotel hotel) {
		hotel = hRepository.save(hotel);

		return hotel;
	}

	public Hotel putByPrice(Hotel hotel, long bookingid) {
		Hotel y = hRepository.findBybookingid(bookingid);
		if (y != null) {
			y.setCity(hotel.getCity());
			y = hRepository.save(y);
		}
		return y;
	}

	public String deletehotel(long bookingid) {
		Hotel x = hRepository.findBybookingid(bookingid);
		if(x != null) {
			hRepository.delete(x);
			return "deleted";
		}
		else {

		return "can't delete";
	}
	
	
	}
}
