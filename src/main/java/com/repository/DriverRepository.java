package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Driver;

public interface DriverRepository extends Neo4jRepository<Driver, Long> {

}
