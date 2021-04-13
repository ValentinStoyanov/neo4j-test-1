package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Trailer {
	





	public Trailer(String chassisnumber, String registrationtag, String brand, String model, String type, int idload) {
		super();
		this.chassisnumber = chassisnumber;
		this.registrationtag = registrationtag;
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.idload = idload;
	}



	@Id @GeneratedValue private Long id;
	private String chassisnumber;
	private String registrationtag;
	private String brand;
	private String model;
	private String type;
	private int idload;
	

	
	public Trailer() {
		
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



	public int getIdload() {
		return idload;
	}



	public void setIdload(int idload) {
		this.idload = idload;
	}




	

	
	
}
