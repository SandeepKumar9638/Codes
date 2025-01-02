package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hotel_Details")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="BOOING_ID")
	private long bookingid;

	@Column(name = "CUSTOMER_NAME")
	private String name;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "PRICE")
	private Double price;

	public long getBookingid() {
		return bookingid;
	}

	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
