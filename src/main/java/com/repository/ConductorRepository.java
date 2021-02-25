package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Conductor;

public interface ConductorRepository extends Neo4jRepository<Conductor, Long> {

}
