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
	private String permisos_conducir;
	
	public Conductor(String dni, String nombre, String apellidos, String permisos_conducir) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.permisos_conducir = permisos_conducir;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermisos_conducir() {
		return permisos_conducir;
	}

	public void setPermisos_conducir(String permisos_conducir) {
		this.permisos_conducir = permisos_conducir;
	}


}