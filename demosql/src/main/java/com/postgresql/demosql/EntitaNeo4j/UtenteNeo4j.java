package com.postgresql.demosql.EntitaNeo4j;


import java.util.Date;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;



@Node("Utente")
public class UtenteNeo4j {
        
    // ------ PROPERTY ------
    @Id 
    private Long id;
    
    @Property("nome")
    private String nome;

    @Property("cognome")
    private String cognome;

    @Property("dataNascita")
    private Date dataNascita;

    @Property("email")
    private String email;
    
    @Property("telefono")
    private String telefono;

    @Property("username")
    private String username;

    @Property("genere")
    private String genere;

    // ------ AMICI
    @Relationship(type = "AMICO_DI")
    private Set<UtenteNeo4j> amici;

    public Set<UtenteNeo4j> getAmici() {
        return amici;
    }

    // ------ LUOGO
    @Relationship(type = "VIVE_IN")
    private LuogoNeo4j luogo_id;

    public LuogoNeo4j getLuogo_id() {
        return luogo_id;
    }

    // ------ ESPERIENZE LAVORATIVE
    @Relationship(type = "LAVORATO_IN")
    private Set<EsperienzaLavorativaNeo4j> esperienzeLavorative;

    public Set<EsperienzaLavorativaNeo4j> getEsperienzaLavorativaNeo4j() {
        return esperienzeLavorative;
    }

    // ------ GETTER ------
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getdataNascita() {
        return dataNascita;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsername() {
        return username;
    }

    public String getGenere() {
        return genere;
    }

  
}