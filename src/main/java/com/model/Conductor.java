package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Conductor {

	public Conductor(Long id, String dni, String nombre, String apellidos, String permisosconducir) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisosconducir = permisosconducir;
	}



	@Id @GeneratedValue private Long id;
	private String dni;
	private String nombre;
	private String apellidos;
	private String permisosconducir;
	

	
	public Conductor() {
		
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



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getPermisosconducir() {
		return permisosconducir;
	}



	public void setPermisosconducir(String permisosconducir) {
		this.permisosconducir = permisosconducir;
	}

	
}