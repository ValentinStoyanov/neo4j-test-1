package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Camion;
import com.model.Viaje;
import com.model.Carga;
import com.model.Conductor;
import com.model.Coordenada;
import com.model.OrigenDestino;
import com.model.Propietario;
import com.model.Remolque;
import com.repository.CamionRepository;
import com.repository.CargaRepository;
import com.repository.ConductorRepository;
import com.repository.ViajeRepository;
import com.repository.CoordenadaRepository;
import com.repository.OrigenDestinoRepository;
import com.repository.PropietarioRepository;
import com.repository.RemolqueRepository;




@SpringBootApplication
@ComponentScan("com.controller")
@EnableNeo4jRepositories("com.repository")
public class Neo4jTest1Application {
	
	private final static Logger log = LoggerFactory.getLogger(Neo4jTest1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Neo4jTest1Application.class, args);
	
	}

	/*
	@Bean
	CommandLineRunner demo( CamionRepository camionRepository,CargaRepository cargaRepository, ConductorRepository conductorRepository,ViajeRepository viajeRepository,
			CoordenadaRepository coordenadaRepository,OrigenDestinoRepository origenDestinoRepository, PropietarioRepository propietarioRepository,
			RemolqueRepository remolqueRepository) {
		return args -> {

			camionRepository.deleteAll();
			cargaRepository.deleteAll();
			conductorRepository.deleteAll();
			viajeRepository.deleteAll();
			coordenadaRepository.deleteAll();
			origenDestinoRepository.deleteAll();
			propietarioRepository.deleteAll();
			remolqueRepository.deleteAll();
			
			
			
			//Read camion.json
			JSONParser jsonParser = new JSONParser();
			ObjectMapper mapper = new ObjectMapper();
			
	        FileReader reader = new FileReader("camion.json");
	        
	            
	            Object obj = jsonParser.parse(reader);
	 
	            List<Camion> camiones = mapper.readValue(obj.toString(), new TypeReference<List<Camion>>(){});
	            
	            camionRepository.saveAll(camiones);
	   
	         //Read carga.json
			
	            reader = new FileReader("carga.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Carga> cargas  = mapper.readValue(obj.toString(), new TypeReference<List<Carga>>(){});
	            
	            cargaRepository.saveAll(cargas);

	          //Read conductor.json
			
	            reader = new FileReader("conductor.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Conductor> conductores  = mapper.readValue(obj.toString(), new TypeReference<List<Conductor>>(){});
	            
	            conductorRepository.saveAll(conductores);
			
	            //Read coordenada.json
			
	            reader = new FileReader("coordenada.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Coordenada> coordenadas  = mapper.readValue(obj.toString(), new TypeReference<List<Coordenada>>(){});
	            
	            coordenadaRepository.saveAll(coordenadas);
	            
	            //Read origendestino.json
	            
	            reader = new FileReader("origendestino.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<OrigenDestino> origendestino  = mapper.readValue(obj.toString(), new TypeReference<List<OrigenDestino>>(){});
	            
	            origenDestinoRepository.saveAll(origendestino);
	            
			
	            //Read propietario.json
	            
	            reader = new FileReader("propietario.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Propietario> propietario = mapper.readValue(obj.toString(), new TypeReference<List<Propietario>>(){});
	            
	            propietarioRepository.saveAll(propietario);
	            
	            //Read remolque.json
	            
	            reader = new FileReader("remolque.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Remolque> remolque = mapper.readValue(obj.toString(), new TypeReference<List<Remolque>>(){});
	            
	            remolqueRepository.saveAll(remolque);
	            
	            //Read viaje.json
	            
	            reader = new FileReader("viaje.json");
	            
	            obj = jsonParser.parse(reader);
	 
	            List<Viaje> viaje = mapper.readValue(obj.toString(), new TypeReference<List<Viaje>>(){});
	            
	            viajeRepository.saveAll(viaje);
	            
	            
	            
	            

	

			
		};
	}*/
	
}