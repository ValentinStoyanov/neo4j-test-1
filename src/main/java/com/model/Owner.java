package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Owner {


	public Owner(String dni, String fiscalname, String comercialname, String ownername, String telephone) {
		super();
		this.dni = dni;
		this.fiscalname = fiscalname;
		this.comercialname = comercialname;
		this.ownername = ownername;
		this.telephone = telephone;
	}




	@Id @GeneratedValue private Long id;
	private String dni;
	private String fiscalname;
	private String comercialname;
	private String ownername;
	private String telephone;
	

	

	public Owner() {
		
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




	public String getFiscalname() {
		return fiscalname;
	}




	public void setFiscalname(String fiscalname) {
		this.fiscalname = fiscalname;
	}




	public String getComercialname() {
		return comercialname;
	}




	public void setComercialname(String comercialname) {
		this.comercialname = comercialname;
	}




	public String getOwnername() {
		return ownername;
	}




	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}




	public String getTelephone() {
		return telephone;
	}




	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	
}