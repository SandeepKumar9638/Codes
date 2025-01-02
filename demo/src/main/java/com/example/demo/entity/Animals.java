package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Animals {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ANIMAL_ID")
	private long animalId;
	@Column(name="ANIMAL_NAME")
	private  String animalName;
	@Column(name="ANIMAL_TYPE")
	private String animalType;
	@Column(name="ANIMAL_COST")
	private int animalCost;
	public long getAnimalId() {
		return animalId;
	}
	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public int getAnimalCost() {
		return animalCost;
	}
	public void setAnimalCost(int animalCost) {
		this.animalCost = animalCost;
	}
	
	

}
