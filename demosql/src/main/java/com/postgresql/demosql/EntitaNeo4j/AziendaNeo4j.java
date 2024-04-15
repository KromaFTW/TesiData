package com.postgresql.demosql.EntitaNeo4j;

import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.Data;


@Data
@Node("Azienda")
public class AziendaNeo4j {
    
    @Id
    private Long id;

    @Property("nome")
    private String nome;

    @Property("settore")
    private String settore;

    @Relationship(type = "SITUATA_IN")
    private LuogoNeo4j luogo_id;

    @Relationship(type = "AZIENDA_ESP")
    private Set<EsperienzaLavorativaNeo4j> esperienzeLavorative;

}
