package com.postgresql.demosql.model;


import java.util.Date;
import java.util.Set;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EsperienzaLavorativaModel {

    private Long id;
    private Date dataInizio;
    private Date dataFine;
    private String posizione;
    private String descrizione;

    private Set<UtenteModel> utenti;

    private Set<AziendaModel> aziende;

}   
