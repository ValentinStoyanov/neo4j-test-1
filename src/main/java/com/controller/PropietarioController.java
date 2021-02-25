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
import com.model.Propietario;
import com.repository.CoordenadaRepository;
import com.repository.PropietarioRepository;

@RestController
@RequestMapping("propietario")
public class PropietarioController {
	
	@Autowired
	private PropietarioRepository propietarioRepository;
	
	private final Driver driver ; 

	public PropietarioController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationPropietarioDestino", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionCamion() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Propietario), (b:OrigenDestino)\r\n"
					+ "WHERE a.dni =  b.idPropietario \r\n"
					+ "CREATE (a)-[r:PERTENECE_A]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Propietario> getAll(){
        
        return this.propietarioRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Propietario> create(@RequestBody List<Propietario> propietario) {
		
		return this.propietarioRepository.saveAll(propietario);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.propietarioRepository.deleteAll();
		
	}

}