package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Viaje {

	@Id @GeneratedValue private Long id;
	private String idConductor;
	private String idCamion;
	private String idRemolque;

	public Viaje(String idConductor, String idCamion, String idRemolque) {
		
		this.idConductor = idConductor;
		this.idCamion = idCamion;
		this.idRemolque = idRemolque;
	}
	
	public Viaje() {
		
	}
	

	public String getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}

	public String getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}

	public String getIdRemolque() {
		return idRemolque;
	}

	public void setIdRemolque(String idRemolque) {
		this.idRemolque = idRemolque;
	}
}