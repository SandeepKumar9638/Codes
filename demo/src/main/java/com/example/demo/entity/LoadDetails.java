package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "load_details")
public class LoadDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//@Column(name="id")
	private long id;
	   
	@Column(name = "driver_name")
	private String drivername;
	
	@Column(name = "kms_driven")
	private double kms;
	
	@Column(name ="pay_scale")
	private double salary;
	
	@Column(name ="registration_number")
	private String registrationnumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRegistrationnumber() {
		return registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	@Override
	public String toString() {
		return "LoadDetails [id=" + id + ", drivername=" + drivername + ", kms=" + kms + ", salary=" + salary
				+ ", registrationnumber=" + registrationnumber + "]";
	}

	public LoadDetails(int id, String drivername, double kms, double salary, String registrationnumber) {
		super();
		this.id = id;
		this.drivername = drivername;
		this.kms = kms;
		this.salary = salary;
		this.registrationnumber = registrationnumber;
	}

	public LoadDetails() {
		super();

	}
	
	
	
	

}
