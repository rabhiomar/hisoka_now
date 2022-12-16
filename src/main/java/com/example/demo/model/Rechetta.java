package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rechetta {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  String aya ;
	private String omar;
	public Rechetta(String aya, String omar) {
		super();
		this.aya = aya;
		this.omar = omar;
	}
	
	
}
