package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Remolque;

public interface RemolqueRepository extends Neo4jRepository<Remolque, Long>{

}
