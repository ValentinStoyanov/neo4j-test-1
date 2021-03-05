package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Propietario {





	@Id @GeneratedValue private Long id;
	private String dni;
	private String nombre_fiscal;
	private String nombre_comercial;
	private String nombre_propietario;
	private String telefono;
	

	
	public Propietario( String dni, String nombre_fiscal, String nombre_comercial, String nombre_propietario,
			String telefono) {
		super();
		this.dni = dni;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.nombre_propietario = nombre_propietario;
		this.telefono = telefono;
	}
	
	public Propietario() {
		
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



	public String getNombre_fiscal() {
		return nombre_fiscal;
	}



	public void setNombre_fiscal(String nombre_fiscal) {
		this.nombre_fiscal = nombre_fiscal;
	}



	public String getNombre_comercial() {
		return nombre_comercial;
	}



	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}



	public String getNombre_propietario() {
		return nombre_propietario;
	}



	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}