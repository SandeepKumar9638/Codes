package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String state;
	private String district;
	
	public Country(long id, String state, String district) {
		super();
		this.id = id;
		this.state = state;
		this.district = district;
	}
	public Country() {
		super();
		
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", state=" + state + ", district=" + district + "]";
	}
	

}
