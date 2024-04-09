package com.postgresql.demosql.repository_Neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.postgresql.demosql.EntitaNeo4j.AziendaNeo4j;

public interface AziendaNeo4jRepository  extends Neo4jRepository<AziendaNeo4j, Long>{

    
} 