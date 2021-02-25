package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class OrigenDestino {
	
	@Id @GeneratedValue private Long id;
	private String idPropietario;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String idCoordenadas;
	
	public OrigenDestino(String idPropietario, String direccion, String ciudad, String provincia,
			String idCoordenadas) {
		
		this.idPropietario = idPropietario;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.idCoordenadas = idCoordenadas;
	}
	
	public OrigenDestino() {
		
	}

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
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

	public String getIdCoordenadas() {
		return idCoordenadas;
	}

	public void setIdCoordenadas(String idCoordenadas) {
		this.idCoordenadas = idCoordenadas;
	}
}
