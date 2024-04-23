package com.postgresql.demosql.EntitaNeo4j;

import java.util.Date;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import lombok.Data;


@Data
@Node("Esperienza_Lavorativa")
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

    
    // ------- AZIENDA -------
    @Relationship(type = "AZIENDA")
    private AziendaNeo4j azienda;

    // ------- UTENTE -------
    @Relationship(type = "LAVORATO_DA", direction = Relationship.Direction.INCOMING)
    private UtenteNeo4j utente;


    



}
