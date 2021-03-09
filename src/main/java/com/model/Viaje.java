package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Viaje {




	public Viaje(Long id, String idconductor, String idcamion, String idremolque) {
		super();
		this.id = id;
		this.idconductor = idconductor;
		this.idcamion = idcamion;
		this.idremolque = idremolque;
	}









	@Id @GeneratedValue private Long id;
	private String idconductor;
	private String idcamion;
	private String idremolque;


	
	
	public Viaje() {
		
	}




	public String getIdconductor() {
		return idconductor;
	}




	public void setIdconductor(String idconductor) {
		this.idconductor = idconductor;
	}




	public String getIdcamion() {
		return idcamion;
	}




	public void setIdcamion(String idcamion) {
		this.idcamion = idcamion;
	}




	public String getIdremolque() {
		return idremolque;
	}




	public void setIdremolque(String idremolque) {
		this.idremolque = idremolque;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}



	

	
}