package com.cognizant.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Teacher() 
	{
		
	}
	
	public Teacher(String title) 
	{
		this.setName(title);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}