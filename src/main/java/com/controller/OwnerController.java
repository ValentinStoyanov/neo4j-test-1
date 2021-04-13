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
import com.model.Owner;
import com.repository.CoordinateRepository;
import com.repository.OwnerRepository;

@RestController
@RequestMapping("owner")
public class OwnerController {
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	private final Driver driver ; 

	public OwnerController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationOwnerDestiny", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationOwnerDestiny() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Owner), (b:OriginDestiny)\r\n"
					+ "WHERE a.dni =  b.idowner \r\n"
					+ "CREATE (a)-[r:OWNS]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Owner> getAll(){
        
        return this.ownerRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Owner> create(@RequestBody List<Owner> owner) {
		
		return this.ownerRepository.saveAll(owner);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.ownerRepository.deleteAll();
		
	}

}