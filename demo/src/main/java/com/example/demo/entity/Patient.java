package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_Table")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name= "pateint_Id")
	private long patientid;
	
	@Column(name="patient_First_Name")
	private String patientFirstName;
	
	@Column(name= "Patient_Middle_Name")
	private String patientMiddleName;
	
	@Column(name="patient_Last_NaMe")
	private String patientLastName;
	
	@Column(name="patient_Professsion")
	private String patientProfesssion;
	
	@Column(name="patient_Mobile_Number")
	private long patientMobileNumber;
	
	@Column(name="patient_Address")
	private String patientAddress;
	
	@Column(name="patient_Email")
	private String patientEmail;
	
	public long getPatientid() {
		return patientid;
	}

	public void setPatientid(long patientid) {
		this.patientid = patientid;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientMiddleName() {
		return patientMiddleName;
	}

	public void setPatientMiddleName(String patientMiddleName) {
		this.patientMiddleName = patientMiddleName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientProfesssion() {
		return patientProfesssion;
	}

	public void setPatientProfesssion(String patientProfesssion) {
		this.patientProfesssion = patientProfesssion;
	}

	public long getPatientMobileNumber() {
		return patientMobileNumber;
	}

	public void setPatientMobileNumber(long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	
	

}
