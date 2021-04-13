package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Record;
import org.neo4j.driver.Session;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("query")
public class QueryController {

	
	private final Driver driver;
	
	public QueryController (Driver driver) { 
		this.driver = driver;
	}
	
	
	@PostMapping(path = "detachdelete", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String detachdelete() {
		
		try (Session session = driver.session()) { 
			return  session.run("MATCH (n) DETACH DELETE n ").toString();
		}
	}
		
	
	@GetMapping(path = "consulta", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<String>  crearRelacionCamion() {

		
		
		try (Session session = driver.session()) { 
			
			List<Record> ll = session.run("MATCH(o:OrigenDestino) MATCH(d:OrigenDestino)  MATCH(v:Viaje) MATCH(c:Camion) MATCH(x:Conductor) MATCH(r:Remolque) MATCH(s:Carga) WHERE s.codigo = r.idcarga AND v.idcamion=c.matricula AND v.idconductor=x.dni AND r.matricula=v.idremolque AND s.idorigen=o.direccion AND s.iddestino=d.direccion AND s.peso<500  "
					+ " return v,c,x,r,s,o,d ").list();
			
			List<String> ss = new ArrayList();
			
			String result = "";
			
			for(int i = 0; i < ll.size();i++) {
				
				result = ll.get(i).get("v").asNode().get("idconductor").asString();
				result = result +"   "+ ll.get(i).get("c").asNode().get("marca").asString();
				result = result +"   "+ ll.get(i).get("x").asNode().get("nombre").asString();
				result = result +"   "+ ll.get(i).get("r").asNode().get("marca").asString();
				result = result +"   "+ ll.get(i).get("s").asNode().get("tipo").asString();
				result = result +"   "+ ll.get(i).get("o").asNode().get("direccion").asString();
				result = result +"   "+ ll.get(i).get("d").asNode().get("direccion").asString();
				
				ss.add(result);
			}
			
			
			 return ss;
		}
	}
}
