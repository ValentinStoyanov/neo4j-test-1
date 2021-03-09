package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Remolque {
	
	public Remolque(Long id, String numerobastidor, String matricula, String marca, String modelo, String tipo,
			int idcarga) {
		super();
		this.id = id;
		this.numerobastidor = numerobastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.idcarga = idcarga;
	}




	@Id @GeneratedValue private Long id;
	private String numerobastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	private int idcarga;
	
	

	
	public Remolque() {
		
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNumerobastidor() {
		return numerobastidor;
	}




	public void setNumerobastidor(String numerobastidor) {
		this.numerobastidor = numerobastidor;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public int getIdcarga() {
		return idcarga;
	}




	public void setIdcarga(int idcarga) {
		this.idcarga = idcarga;
	}



	
	
}
