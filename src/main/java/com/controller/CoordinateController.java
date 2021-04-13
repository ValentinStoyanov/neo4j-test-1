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

import com.model.Coordinate;
import com.repository.CoordinateRepository;

@RestController
@RequestMapping("coordinate")
public class CoordinateController {
	
	@Autowired
	private CoordinateRepository coordinateRepository;
	
	private final Driver driver ; 

	public CoordinateController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationCoordinateDestiny", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationCoordinateOriginDestiny() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Coordinate), (b:OriginDestiny)\r\n"
					+ "WHERE a.latitude =  b.idcoordinate \r\n"
					+ "CREATE (b)-[r:POSITION_IN_MAP]->(a)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Coordinate> getAll(){
        
        return this.coordinateRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Coordinate> create(@RequestBody List<Coordinate> coordinate) {
		
		return this.coordinateRepository.saveAll(coordinate);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.coordinateRepository.deleteAll();
		
	}

}