package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="IMAGE_UPLOAD")
@Entity
public class ImageUpload {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ID")
	private long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name="BOMMA")
	private String bomma;
	
	
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
	public String getBomma() {
		return bomma;
	}
	public void setBomma(String bomma) {
		this.bomma = bomma;
	}

}
