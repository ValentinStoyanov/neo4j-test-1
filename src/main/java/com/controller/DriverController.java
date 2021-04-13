package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.DriverRepository;

@RestController
@RequestMapping("driver")
public class DriverController {
	
	@Autowired
	private DriverRepository driverRepository;
	

	
	
	@GetMapping(value="getAll")
    public List<com.model.Driver> getAll(){
        
        return this.driverRepository.findAll();
    }
	
	@PostMapping("create")
	public List<com.model.Driver> create(@RequestBody List<com.model.Driver> driver) {
		
		return this.driverRepository.saveAll(driver);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.driverRepository.deleteAll();
		
	}

}