package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UploadImage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String profileimage;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfileimage() {
		return profileimage;
	}
	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}
	public UploadImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UploadImage(int id, String name, String profileimage) {
		super();
		this.id = id;
		this.name = name;
		this.profileimage = profileimage;
	}
	@Override
	public String toString() {
		return "UploadImage [id=" + id + ", name=" + name + ", profileimage=" + profileimage + "]";
	}
	
	

}
