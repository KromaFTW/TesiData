package com.postgresql.demosql.EntitaNeo4j;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;



@Node("Luogo")
public class LuogoNeo4j {

    @Id
    private Long id;

    @Property("nome")
    private String nome;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
