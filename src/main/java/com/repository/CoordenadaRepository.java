package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Coordenada;

public interface CoordenadaRepository extends Neo4jRepository<Coordenada, Long>{

}
