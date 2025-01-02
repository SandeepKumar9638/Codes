package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String studentname;
	private String email;
	private String studentAddress;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;     
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(long id, String studentname, String email, String studentAddress) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.email = email;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", email=" + email + ", studentAddress="
				+ studentAddress + "]";
	}
	

}
