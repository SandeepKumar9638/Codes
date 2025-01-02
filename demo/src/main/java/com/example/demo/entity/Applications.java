package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Applications {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long id;
private String name;
private double size;
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
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}

}
