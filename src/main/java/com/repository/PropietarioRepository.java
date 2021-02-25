package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Propietario;

public interface PropietarioRepository extends Neo4jRepository<Propietario, Long>{

}
