package com.postgresql.demosql.EntitaNeo4j;

import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;


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

    public LuogoNeo4j getLuogoAzienda_id() {
        return luogo_id;
    }

    @Relationship(type = "AZIENDA")
    private Set<EsperienzaLavorativaNeo4j> esperienzeLavorative;

    public Set<EsperienzaLavorativaNeo4j> esperienzeLavorative() {
        return esperienzeLavorative;
    }
    
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSettore() {
        return settore;
    }

    public LuogoNeo4j getLuogo_id() {
        return luogo_id;
    }

    public Set<EsperienzaLavorativaNeo4j> getEsperienzeLavorative() {
        return esperienzeLavorative;
    }
}
