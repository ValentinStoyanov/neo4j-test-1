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

import com.model.Camion;
import com.model.Conductor;
import com.repository.CamionRepository;
import com.repository.ConductorRepository;

@RestController
@RequestMapping("conductor")
public class ConductorController {
	
	@Autowired
	private ConductorRepository conductorRepository;
	

	
	
	@GetMapping(value="getAll")
    public List<Conductor> getAll(){
        
        return this.conductorRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Conductor> create(@RequestBody List<Conductor> conductor) {
		
		return this.conductorRepository.saveAll(conductor);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.conductorRepository.deleteAll();
		
	}

}