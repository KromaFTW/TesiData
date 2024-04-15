package com.postgresql.demosql.entita;



import java.util.Set;
import java.util.Date;
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
@Table(name = "esperienza_lavorativa")
public class EsperienzaLavorativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataInizio;
    private Date dataFine;
    private String posizione;
    private String descrizione;
    
    @ManyToMany(mappedBy = "esperienzeLavorative")
    private Set<Azienda> aziende;

    @ManyToMany
    @JoinTable(
        name = "esperienza_lavorativa_utente",
        joinColumns = { @JoinColumn(name = "esperienza_Ulavorativa_id") },
        inverseJoinColumns = { @JoinColumn(name = "utenteId") }
    )
    private Set<Utente> utenti;

   
}
