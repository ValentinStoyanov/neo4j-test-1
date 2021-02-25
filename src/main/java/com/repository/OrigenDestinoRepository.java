package com.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.model.OrigenDestino;

public interface OrigenDestinoRepository extends Neo4jRepository<OrigenDestino, Long>{

}
