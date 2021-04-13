package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Coordinate;

public interface CoordinateRepository extends Neo4jRepository<Coordinate, Long>{

}
