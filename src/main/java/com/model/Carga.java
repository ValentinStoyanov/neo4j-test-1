package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Carga {

	public Carga(Long id, int codigo, String tipo, String peso, String idorigen, String iddestino) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.idorigen = idorigen;
		this.iddestino = iddestino;
	}




	@Id @GeneratedValue private Long id;
	private int codigo;
	private String tipo;
	private String peso;
	private String idorigen;
	private String iddestino;
	
	

	
	public Carga() {
		
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
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




	public String getIdorigen() {
		return idorigen;
	}




	public void setIdorigen(String idorigen) {
		this.idorigen = idorigen;
	}




	public String getIddestino() {
		return iddestino;
	}




	public void setIddestino(String iddestino) {
		this.iddestino = iddestino;
	}

	

	
}