package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class OriginDestiny {
	





	public OriginDestiny(String idowner, String address, String city, String province, String idcoordinate) {
		super();
		this.idowner = idowner;
		this.address = address;
		this.city = city;
		this.province = province;
		this.idcoordinate = idcoordinate;
	}



	@Id @GeneratedValue private Long id;
	private String idowner;
	private String address;
	private String city;
	private String province;
	private String idcoordinate;
	
	
	
	public OriginDestiny() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getIdowner() {
		return idowner;
	}



	public void setIdowner(String idowner) {
		this.idowner = idowner;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getIdcoordinate() {
		return idcoordinate;
	}



	public void setIdcoordinate(String idcoordinate) {
		this.idcoordinate = idcoordinate;
	}



	
	
}
