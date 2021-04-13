package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;


import com.model.Load;

public interface LoadRepository extends Neo4jRepository<Load, Long>{

}
