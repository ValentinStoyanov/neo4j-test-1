package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
