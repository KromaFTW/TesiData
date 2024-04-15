package com.postgresql.demosql.repository_Neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.postgresql.demosql.EntitaNeo4j.EsperienzaLavorativaNeo4j;

public interface EsperienzaLavorativaNeo4jRepository  extends Neo4jRepository<EsperienzaLavorativaNeo4j, Long>{

    
} 
