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
	private String id_origen;
	private String id_destino;
	
	
	public Carga(String codigo, String tipo, String peso, String id_origen, String id_destino) {
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.id_origen = id_origen;
		this.id_destino = id_destino;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getId_origen() {
		return id_origen;
	}

	public void setId_origen(String id_origen) {
		this.id_origen = id_origen;
	}

	public String getId_destino() {
		return id_destino;
	}

	public void setId_destino(String id_destino) {
		this.id_destino = id_destino;
	}


	
}