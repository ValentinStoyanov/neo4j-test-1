package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Propietario;
import com.model.Remolque;
import com.repository.PropietarioRepository;
import com.repository.RemolqueRepository;

@RestController
@RequestMapping("remolque")
public class RemolqueController {
	
	@Autowired
	private RemolqueRepository remolqueRepository;
	

	
	
	@GetMapping(value="getAll")
    public List<Remolque> getAll(){
        
        return this.remolqueRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Remolque> create(@RequestBody List<Remolque> remolque) {
		
		return this.remolqueRepository.saveAll(remolque);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.remolqueRepository.deleteAll();
		
	}

}