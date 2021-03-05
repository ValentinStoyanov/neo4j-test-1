package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Remolque {





	@Id @GeneratedValue private Long id;
	private String numero_bastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	private String id_carga;
	
	
	public Remolque(String numero_bastidor, String matricula, String marca, String modelo, String tipo,
			String id_carga) {
		super();
		this.numero_bastidor = numero_bastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.id_carga = id_carga;
	}
	
	
	public Remolque() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNumero_bastidor() {
		return numero_bastidor;
	}



	public void setNumero_bastidor(String numero_bastidor) {
		this.numero_bastidor = numero_bastidor;
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



	public String getId_carga() {
		return id_carga;
	}



	public void setId_carga(String id_carga) {
		this.id_carga = id_carga;
	}

	
}
