package com.controller;

import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trailer;
import com.model.Travel;
import com.repository.TrailerRepository;
import com.repository.TravelRepository;

@RestController
@RequestMapping("travel")
public class TravelController {
	
	@Autowired
	private TravelRepository travelRepository;
	
	private final Driver driver ; 

	public TravelController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationTruck", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationTruckTravel() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Truck), (b:Travel)\r\n"
					+ "WHERE a.registrationtag =  b.idtruck \r\n"
					+ "CREATE (a)-[r:TRUCK_IN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	@PostMapping(path = "relationDriver", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationDriverTravel() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Driver), (b:Travel)\r\n"
					+ "WHERE a.dni =  b.iddriver \r\n"
					+ "CREATE (a)-[r:DRIVES_IN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@PostMapping(path = "relationTrailer", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationTrailerTravel() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Trailer), (b:Travel)\r\n"
					+ "WHERE a.registrationtag =  b.idtrailer \r\n"
					+ "CREATE (a)-[r:LOADS_IN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Travel> getAll(){
        
        return this.travelRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Travel> create(@RequestBody List<Travel> travel) {
		
		return this.travelRepository.saveAll(travel);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.travelRepository.deleteAll();
		
	}

}