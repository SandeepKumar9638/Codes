package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private int createdDtTime;
	private String firsName;
	private String lastName;
	private String userEmail;
	private String generatedBy;
	private String position;
	private String role;
	private String status;
	private String userPassword;
	private double ctc ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCreatedDtTime() {
		return createdDtTime;
	}
	public void setCreatedDtTime(int createdDtTime) {
		this.createdDtTime = createdDtTime;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getGeneratedBy() {
		return generatedBy;
	}
	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public Details(long id, int createdDtTime, String firsName, String lastName, String userEmail,
			String generatedBy, String position, String role, String status, String userPassword, double ctc) {
		super();
		this.id = id;
		this.createdDtTime = createdDtTime;
		this.firsName = firsName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.generatedBy = generatedBy;
		this.position = position;
		this.role = role;
		this.status = status;
		this.userPassword = userPassword;
		this.ctc = ctc;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", createdDtTime=" + createdDtTime + ", firsName=" + firsName + ", lastName="
				+ lastName + ", userEmail=" + userEmail + ", generatedBy=" + generatedBy + ", position=" + position
				+ ", role=" + role + ", status=" + status + ", userPassword=" + userPassword + ", ctc=" + ctc + "]";
	}
	
}
	
	
	
	


