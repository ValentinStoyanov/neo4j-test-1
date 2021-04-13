package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Truck;

public interface TruckRepository extends Neo4jRepository<Truck, Long>{

}
