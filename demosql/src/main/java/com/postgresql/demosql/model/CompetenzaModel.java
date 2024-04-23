package com.postgresql.demosql.model;

import java.util.Set;

import lombok.Data;

@Data
public class CompetenzaModel {
    private Long id;
    private String nome;

    private Set<UtenteModel> utenti;
}
