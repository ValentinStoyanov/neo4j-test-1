package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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