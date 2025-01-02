package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRAVEL_LOGS")
public class TravelLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "ID")
	private long id;
	
	@Column(name = " CUSTOMER_NAME")
	private String name;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name= "TRAVEL_DAY")
	private String day;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name= "TRAVELLOG_HOTEL")
	private Hotel hotel;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "TRAVELLOG_BIKES")
    private Bikes bikes;
	
	public Bikes getBikes() {
		return bikes;
	}

	public void setBikes(Bikes bikes) {
		this.bikes = bikes;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	} 

}
