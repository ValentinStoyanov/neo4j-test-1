package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class OrigenDestino {
	

	public OrigenDestino(Long id, String idpropietario, String direccion, String ciudad, String provincia,
			String idcoordenadas) {
		super();
		this.id = id;
		this.idpropietario = idpropietario;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.idcoordenadas = idcoordenadas;
	}



	@Id @GeneratedValue private Long id;
	private String idpropietario;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String idcoordenadas;
	
	
	
	public OrigenDestino() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getIdpropietario() {
		return idpropietario;
	}



	public void setIdpropietario(String idpropietario) {
		this.idpropietario = idpropietario;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public String getIdcoordenadas() {
		return idcoordenadas;
	}



	public void setIdcoordenadas(String idcoordenadas) {
		this.idcoordenadas = idcoordenadas;
	}

	
	
}
