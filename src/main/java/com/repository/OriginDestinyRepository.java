package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.OriginDestiny;

public interface OriginDestinyRepository extends Neo4jRepository<OriginDestiny, Long>{

}
