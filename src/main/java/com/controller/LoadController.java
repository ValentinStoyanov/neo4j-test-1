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
import com.model.Load;
import com.repository.LoadRepository;

@RestController
@RequestMapping("load")
public class LoadController {
	
	@Autowired
	private LoadRepository loadRepository;

	private final Driver driver ; 

	public LoadController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationLoadOrigin", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationLoadDestiny() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Load), (b:OriginDestiny)\r\n"
					+ "WHERE a.idorigin =  b.address \r\n"
					+ "CREATE (a)-[r:FROM]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@PostMapping(path = "relationLoadDestiny", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String relationLoadOriginDestiny() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Load), (b:OriginDestiny)\r\n"
					+ "WHERE a.iddestiny =  b.address \r\n"
					+ "CREATE (a)-[r:GOES_TO]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Load> getAll(){
        
        return this.loadRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Load> create(@RequestBody List<Load> load) {
		
		return this.loadRepository.saveAll(load);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.loadRepository.deleteAll();
		
	}
	
	
	
}
