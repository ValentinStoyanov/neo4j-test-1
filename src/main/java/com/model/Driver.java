package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Driver {





	public Driver(String dni, String name, String surname, String driverlicense) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.driverlicense = driverlicense;
	}



	@Id @GeneratedValue private Long id;
	private String dni;
	private String name;
	private String surname;
	private String driverlicense;
	

	
	public Driver() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getDriverlicense() {
		return driverlicense;
	}



	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}



	

	
}