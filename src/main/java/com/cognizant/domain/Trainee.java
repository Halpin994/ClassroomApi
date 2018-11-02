package com.cognizant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trainee {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "classroom_id")
	private Long classroomID;
	private String traineeName;

	
	Trainee ()
	{
		
	}
	
	public Trainee(String name) 
	{
		this.traineeName = name;
		
	}

	public String getName() {
		return traineeName;
	}

	public void setName(String name) {
		this.traineeName = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
