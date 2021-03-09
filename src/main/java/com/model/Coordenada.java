package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Coordenada {

	public Coordenada(Long id, String latitud, String longitud, String altitud, String tiempo) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.altitud = altitud;
		this.tiempo = tiempo;
	}



	@Id @GeneratedValue private Long id;
	private String latitud;
	private String longitud;
	private String altitud;
	private String tiempo;
	

	
	public Coordenada() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLatitud() {
		return latitud;
	}



	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}



	public String getLongitud() {
		return longitud;
	}



	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}



	public String getAltitud() {
		return altitud;
	}



	public void setAltitud(String altitud) {
		this.altitud = altitud;
	}



	public String getTiempo() {
		return tiempo;
	}



	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	
}
