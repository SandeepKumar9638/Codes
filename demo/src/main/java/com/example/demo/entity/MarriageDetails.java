package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MarriageDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	private String brideName;
	private String groomName;
	private int brideAge;
	private int groomAge;
	
	
	public String getBrideName() {
		return brideName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}
	public String getGroomName() {
		return groomName;
	}
	public void setGroomName(String groomName) {
		this.groomName = groomName;
	}
	public int getBrideAge() {
		return brideAge;
	}
	public void setBrideAge(int brideAge) {
		this.brideAge = brideAge;
	}
	public int getGroomAge() {
		return groomAge;
	}
	public void setGroomAge(int groomAge) {
		this.groomAge = groomAge;
	}

}
