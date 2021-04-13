package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Truck {
	

	public Truck(String chassisnumber, String registrationtag, String brand, String model, String type) {
		super();
		this.chassisnumber = chassisnumber;
		this.registrationtag = registrationtag;
		this.brand = brand;
		this.model = model;
		this.type = type;
	}


	@Id @GeneratedValue private Long id;
	private String chassisnumber;
	private String registrationtag;
	private String brand;
	private String model;
	private String type;
	
	
	public Truck() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getChassisnumber() {
		return chassisnumber;
	}


	public void setChassisnumber(String chassisnumber) {
		this.chassisnumber = chassisnumber;
	}


	public String getRegistrationtag() {
		return registrationtag;
	}


	public void setRegistrationtag(String registrationtag) {
		this.registrationtag = registrationtag;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
}
