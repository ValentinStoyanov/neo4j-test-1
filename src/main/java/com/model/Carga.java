package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Carga {

	@Id @GeneratedValue private Long id;
	private String codigo;
	private String tipo;
	private String peso;
	private String idOrigen;
	private String idDestino;
	
	
	public Carga(String codigo, String tipo, String peso, String idOrigen, String idDestino) {
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
	}
	
	public Carga() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(String idOrigen) {
		this.idOrigen = idOrigen;
	}

	public String getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}
	
}