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

import com.model.Remolque;
import com.model.Viaje;
import com.repository.RemolqueRepository;
import com.repository.ViajeRepository;

@RestController
@RequestMapping("viaje")
public class ViajeController {
	
	@Autowired
	private ViajeRepository viajeRepository;
	
	private final Driver driver ; 

	public ViajeController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationCamion", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionCamion() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Camion), (b:Viaje)\r\n"
					+ "WHERE a.matricula =  b.idcamion \r\n"
					+ "CREATE (a)-[r:CAMION_EN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	@PostMapping(path = "relationConductor", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionConductor() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Conductor), (b:Viaje)\r\n"
					+ "WHERE a.dni =  b.idconductor \r\n"
					+ "CREATE (a)-[r:CONDUCE_EN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@PostMapping(path = "relationRemolque", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionRemolque() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Remolque), (b:Viaje)\r\n"
					+ "WHERE a.matricula =  b.idremolque \r\n"
					+ "CREATE (a)-[r:CARGA_EN]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Viaje> getAll(){
        
        return this.viajeRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Viaje> create(@RequestBody List<Viaje> viaje) {
		
		return this.viajeRepository.saveAll(viaje);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.viajeRepository.deleteAll();
		
	}

}