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
import com.model.Camion;
import com.repository.CamionRepository;



@RestController
@RequestMapping("camion")
public class CamionController {
	
	@Autowired
	private CamionRepository camionRepository;
	

	
	
	@GetMapping(value="getAll")
    public List<Camion> getAll(){
        
        return this.camionRepository.findAll();
    }
	
	@PostMapping("create")
	public List<Camion> create(@RequestBody List<Camion> camion) {
		
		return this.camionRepository.saveAll(camion);
		
	}
	
	@PostMapping("deleteAll")
	public void delete_all() {
		this.camionRepository.deleteAll();
		
	}

}
