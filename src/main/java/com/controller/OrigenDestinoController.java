package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.OrigenDestino;
import com.repository.CoordenadaRepository;
import com.repository.OrigenDestinoRepository;

@RestController
@RequestMapping("origendestino")
public class OrigenDestinoController {
	
	@Autowired
	private OrigenDestinoRepository origendestinoRepository;
	

	
	
	@GetMapping(value="getAll")
    public List<OrigenDestino> getAll(){
        
        return this.origendestinoRepository.findAll();
    }
	
	@PostMapping("create")
	public List<OrigenDestino> create(@RequestBody List<OrigenDestino> origendestino) {
		
		return this.origendestinoRepository.saveAll(origendestino);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.origendestinoRepository.deleteAll();
		
	}

}