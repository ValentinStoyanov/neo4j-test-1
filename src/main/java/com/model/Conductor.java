package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Conductor {

	@Id @GeneratedValue private Long id;
	private String dni;
	private String nombre;
	private String apellidos;
	private String permisoConducir;
	
	public Conductor(String dni, String nombre, String apellidos, String permisoConducir) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisoConducir = permisoConducir;
	}
	
	public Conductor() {
		
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

	public String getPermisoConducir() {
		return permisoConducir;
	}

	public void setPermisoConducir(String permisoConducir) {
		this.permisoConducir = permisoConducir;
	}
}