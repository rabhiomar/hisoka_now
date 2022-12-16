package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manga {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id ;
	
	private  String name;
	private  String description ;
	private  String  date_sorti ;
	private  String narrateur;
	public Manga(int id, String name, String description, String date_sorti, String narrateur) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date_sorti = date_sorti;
		this.narrateur = narrateur;
	}
	public Manga() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_sorti() {
		return date_sorti;
	}
	public void setDate_sorti(String date_sorti) {
		this.date_sorti = date_sorti;
	}
	public String getNarrateur() {
		return narrateur;
	}
	public void setNarrateur(String narrateur) {
		this.narrateur = narrateur;
	}
	@Override
	public String toString() {
		return "Manga [id=" + id + ", name=" + name + ", description=" + description + ", date_sorti=" + date_sorti
				+ ", narrateur=" + narrateur + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
