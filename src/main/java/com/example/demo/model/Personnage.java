package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Personnage {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String noms ;
	private  int  age ;
	private String  desc ;
	public Personnage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnage(int id, String noms, int age, String desc) {
		super();
		this.id = id;
		this.noms = noms;
		this.age = age;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	} 

	

}
