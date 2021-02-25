package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;


import com.model.Carga;

public interface CargaRepository extends Neo4jRepository<Carga, Long>{

}
