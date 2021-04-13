package com.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Coordinate {





	public Coordinate(String latitude, String longitude, String altitude, String time) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.time = time;
	}


	@Id @GeneratedValue private Long id;
	private String latitude;
	private String longitude;
	private String altitude;
	private String time;

	
	public Coordinate() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getAltitude() {
		return altitude;
	}


	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}



	

	
}
