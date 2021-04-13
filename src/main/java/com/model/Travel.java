package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Travel {


	public Travel(String iddriver, String idtruck, String idtrailer) {
		super();
		this.iddriver = iddriver;
		this.idtruck = idtruck;
		this.idtrailer = idtrailer;
	}




	@Id @GeneratedValue private Long id;
	private String iddriver;
	private String idtruck;
	private String idtrailer;


	
	
	public Travel() {
		
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getIddriver() {
		return iddriver;
	}




	public void setIddriver(String iddriver) {
		this.iddriver = iddriver;
	}




	public String getIdtruck() {
		return idtruck;
	}




	public void setIdtruck(String idtruck) {
		this.idtruck = idtruck;
	}




	public String getIdtrailer() {
		return idtrailer;
	}




	public void setIdtrailer(String idtrailer) {
		this.idtrailer = idtrailer;
	}



	
}