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

import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hService;
	
	@PostMapping("/postHotels")
	public Hotel post(@RequestBody Hotel hotel) {
		hotel = hService.post(hotel);
		return hotel;
	}
	
	@GetMapping("/getHotels")
	public List<Hotel> getAllHotel(){
		return hService.getAllhotel();
	}
	
	@GetMapping("/getHotels/{price}")
	public Hotel getByprice(@PathVariable double price ) {
		return hService.getByprice(price);
	}
	
	@PutMapping("/putHotels")
	public Hotel put(@RequestBody Hotel hotel) {
		return hService.put(hotel);
	}
	@PutMapping("/putHotels/{bookingid}")
	public Hotel putByPrice(@RequestBody Hotel hotel , @PathVariable long bookingid) {
		return hService.putByPrice(hotel, bookingid);
	}
	
	@DeleteMapping("/deleteHotels/{bookingid}")
	public String deletehotel(@PathVariable long bookingid) {
		return hService.deletehotel(bookingid);
	}
}
	

