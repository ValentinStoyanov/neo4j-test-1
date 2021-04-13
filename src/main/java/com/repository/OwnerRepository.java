package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.Owner;

public interface OwnerRepository extends Neo4jRepository<Owner, Long>{

}
