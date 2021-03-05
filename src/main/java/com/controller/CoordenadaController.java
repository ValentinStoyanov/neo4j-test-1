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

import com.model.Coordenada;
import com.repository.CoordenadaRepository;

@RestController
@RequestMapping("coordenada")
public class CoordenadaController {
	
	@Autowired
	private CoordenadaRepository coordenadaRepository;
	
	private final Driver driver ; 

	public CoordenadaController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationCoordenadaDestino", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionCamion() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Coordenada), (b:OrigenDestino)\r\n"
					+ "WHERE a.latitud =  b.id_coordenadas \r\n"
					+ "CREATE (b)-[r:SE_ENCUENTRA_EN]->(a)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Coordenada> getAll(){
        
        return this.coordenadaRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Coordenada> create(@RequestBody List<Coordenada> coordenada) {
		
		return this.coordenadaRepository.saveAll(coordenada);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.coordenadaRepository.deleteAll();
		
	}

}