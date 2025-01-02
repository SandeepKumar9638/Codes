package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 private String brand;
	 private double price;
	 private int model;
	 private String ownername;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public Cars(long id, String brand, double price, int model, String ownername) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.ownername = ownername;
	}
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cars [id=" + id + ", brand=" + brand + ", price=" + price + ", model=" + model + ", ownername="
				+ ownername + "]";
	}
	 
	
	
	
		


}
