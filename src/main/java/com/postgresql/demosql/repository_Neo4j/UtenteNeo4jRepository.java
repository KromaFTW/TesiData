package com.postgresql.demosql.repository_Neo4j;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.postgresql.demosql.EntitaNeo4j.UtenteNeo4j;



public interface UtenteNeo4jRepository extends Neo4jRepository<UtenteNeo4j, Long>{
    
}
