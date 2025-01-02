package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userInfold;
	private long mobile;
	@Enumerated (EnumType.STRING)
	private Gender gender;
	private String nationality;
	
	
	public long getUserInfold() {
		return userInfold;
	}
	public void setUserInfold(long userInfold) {
		this.userInfold = userInfold;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserInfo [userInfold=" + userInfold + ", mobile=" + mobile + ", gender=" + gender + ", nationality="
				+ nationality + "]";
	}
	public UserInfo(long userInfold, long mobile, Gender gender, String nationality) {
		super();
		this.userInfold = userInfold;
		this.mobile = mobile;
		this.gender = gender;
		this.nationality = nationality;
	}
	public UserInfo() {
		super();
	
	}
	
}
