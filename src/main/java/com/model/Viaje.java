package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Viaje {




	@Id @GeneratedValue private Long id;
	private String id_conductor;
	private String id_camion;
	private String id_remolque;

	public Viaje(String id_conductor, String id_camion, String id_remolque) {
		super();
		this.id_conductor = id_conductor;
		this.id_camion = id_camion;
		this.id_remolque = id_remolque;
	}

	
	
	public Viaje() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getId_conductor() {
		return id_conductor;
	}



	public void setId_conductor(String id_conductor) {
		this.id_conductor = id_conductor;
	}



	public String getId_camion() {
		return id_camion;
	}



	public void setId_camion(String id_camion) {
		this.id_camion = id_camion;
	}



	public String getId_remolque() {
		return id_remolque;
	}



	public void setId_remolque(String id_remolque) {
		this.id_remolque = id_remolque;
	}
	

	
}