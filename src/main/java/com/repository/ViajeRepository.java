package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Viaje;

public interface ViajeRepository extends Neo4jRepository<Viaje, Long>{

}
