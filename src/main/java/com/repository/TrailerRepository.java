package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Trailer;

public interface TrailerRepository extends Neo4jRepository<Trailer, Long>{

}
