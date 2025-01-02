package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BIKES_INFORMATION")
public class Bikes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ID") 
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="BRAND")
	private String brand;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="YEAR_OF_MADE")
	private int yearOfMade;
	
	@Column(name="CLAIM_MILEAGE")
	private float mileage;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfMade() {
		return yearOfMade;
	}

	public void setYearOfMade(int yearOfMade) {
		this.yearOfMade = yearOfMade;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public Bikes(String brand, String model, int yearOfMade, float mileage) {
		super();
		this.brand = brand;
		this.model = model;
		this.yearOfMade = yearOfMade;
		this.mileage = mileage;
	}

	public Bikes() {
		super();
		
	}

	@Override
	public String toString() {
		return "Bikes [brand=" + brand + ", model=" + model + ", yearOfMade=" + yearOfMade + ", mileage=" + mileage
				+ "]";
	}
	 

}
