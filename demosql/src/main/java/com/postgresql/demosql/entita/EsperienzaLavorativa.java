package com.postgresql.demosql.entita;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EsperienzaLavorativa")
public class EsperienzaLavorativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @ManyToMany(mappedBy = "esperienzeLavorative", cascade = CascadeType.ALL)
    private Set<Azienda> aziende;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "EsperienzaLavorativa_Utente",
        joinColumns = { @JoinColumn(name = "esperienza_Ulavorativa_id") },
        inverseJoinColumns = { @JoinColumn(name = "utente_id") }
    )
    private Set<Utente> utenti;

    private Date dataInizio;
    private Date dataFine;
    private String posizione;
    private String descrizione;
}
