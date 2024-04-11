package com.postgresql.demosql.EntitaNeo4j;

import java.util.Date;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;


@Node("EsperienzaLavorativa")
public class EsperienzaLavorativaNeo4j {

    // ------ PROPERTY ------
    @Id
    private Long id;

    @Property("dataInizio")
    private Date dataInizio;

    @Property("dataFine")
    private Date dataFine;

    @Property("posizione")
    private String posizione;

    @Property("descrizione")
    private String descrizione;

    // ------- UTENTE -------
    @Relationship(type = "LAVORATO_DA")
    private Set<UtenteNeo4j> utenti;
    
    public Set<UtenteNeo4j> getUtenti() {
        return utenti;
    }

    // ------- AZIENDA -------
    @Relationship(type = "AZIENDA")
    private Set<AziendaNeo4j> aziende;

    public Set<AziendaNeo4j> aziende() {
        return aziende;
    } 

    // ------ GETTER ------
    public Long getId() {
        return id;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public String getPosizione() {
        return posizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
