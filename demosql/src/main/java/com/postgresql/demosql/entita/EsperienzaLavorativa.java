package com.postgresql.demosql.entita;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "esperienza_lavorativa")
public class EsperienzaLavorativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataInizio;
    private Date dataFine;
    private String posizione;
    private String descrizione;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    private Azienda azienda;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

}
