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

import com.model.Owner;
import com.model.Trailer;
import com.repository.OwnerRepository;
import com.repository.TrailerRepository;

@RestController
@RequestMapping("trailer")
public class TrailerController {
	
	@Autowired
	private TrailerRepository trailerRepository;
	

	private final Driver driver ; 

	public TrailerController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationTrailerLoad", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationTrailerLoad() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Trailer), (b:Load)\r\n"
					+ "WHERE a.idload =  b.code \r\n"
					+ "CREATE (a)-[r:LOAD]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	
	
	@GetMapping(value="getAll")
    public List<Trailer> getAll(){
        
        return this.trailerRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Trailer> create(@RequestBody List<Trailer> trailer) {
		
		return this.trailerRepository.saveAll(trailer);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.trailerRepository.deleteAll();
		
	}

}