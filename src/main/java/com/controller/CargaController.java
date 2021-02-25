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
import com.model.Carga;
import com.repository.CargaRepository;

@RestController
@RequestMapping("carga")
public class CargaController {
	
	@Autowired
	private CargaRepository cargaRepository;

	private final Driver driver ; 

	public CargaController(Driver driver) { 
		this.driver = driver;
	}

	@PostMapping(path = "relationCargaOrigen", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionCamion() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Carga), (b:OrigenDestino)\r\n"
					+ "WHERE a.idOrigen =  b.direccion \r\n"
					+ "CREATE (a)-[r:PARTE_DE]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@PostMapping(path = "relationCargaDestino", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String crearRelacionC() {

		try (Session session = driver.session()) { 
			return  session.run("MATCH (a:Carga), (b:OrigenDestino)\r\n"
					+ "WHERE a.idDestino =  b.direccion \r\n"
					+ "CREATE (a)-[r:SE_DIRIJE_A]->(b)\r\n"
					+ "RETURN type(r)").toString();
		}
	}
	
	
	@GetMapping(value="getAll")
    public List<Carga> getAll(){
        
        return this.cargaRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Carga> create(@RequestBody List<Carga> carga) {
		
		return this.cargaRepository.saveAll(carga);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.cargaRepository.deleteAll();
		
	}
	
	
	
}
