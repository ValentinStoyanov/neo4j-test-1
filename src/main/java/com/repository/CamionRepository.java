package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Camion;

public interface CamionRepository extends Neo4jRepository<Camion, Long>{

}
