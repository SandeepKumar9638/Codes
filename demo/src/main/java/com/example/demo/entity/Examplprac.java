package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Examplprac {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long sandeepId;
	
	private String name;
	
	private String rollNo;
	
	/*private List<Examplprac> status;
	
	private String message;
	
	public Examplprac(List<Examplprac> status,String message) {
		this.status=status;
		this.message=message;
		
	}*/


}
