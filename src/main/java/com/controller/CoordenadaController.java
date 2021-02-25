package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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