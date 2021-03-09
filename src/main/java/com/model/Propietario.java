package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Propietario {





	public Propietario(Long id, String dni, String nombrefiscal, String nombrecomercial, String nombrepropietario,
			String telefono) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombrefiscal = nombrefiscal;
		this.nombrecomercial = nombrecomercial;
		this.nombrepropietario = nombrepropietario;
		this.telefono = telefono;
	}




	@Id @GeneratedValue private Long id;
	private String dni;
	private String nombrefiscal;
	private String nombrecomercial;
	private String nombrepropietario;
	private String telefono;
	

	

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




	public String getNombrefiscal() {
		return nombrefiscal;
	}




	public void setNombrefiscal(String nombrefiscal) {
		this.nombrefiscal = nombrefiscal;
	}




	public String getNombrecomercial() {
		return nombrecomercial;
	}




	public void setNombrecomercial(String nombrecomercial) {
		this.nombrecomercial = nombrecomercial;
	}




	public String getNombrepropietario() {
		return nombrepropietario;
	}




	public void setNombrepropietario(String nombrepropietario) {
		this.nombrepropietario = nombrepropietario;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	
}