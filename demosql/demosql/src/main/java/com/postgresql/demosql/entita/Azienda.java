package com.postgresql.demosql.entita;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "azienda")
public class Azienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String settore;
    //private String citta;

    @ManyToOne
    @JoinColumn(name = "luogo_id", referencedColumnName = "id")
    private Luogo luogo_id; 



    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "EsperienzaLavorativa_Azienda",
        inverseJoinColumns = { @JoinColumn(name = "esperienza_Alavorativa_id") },
        joinColumns = { @JoinColumn(name = "azienda_id") }
    )
    private Set<EsperienzaLavorativa> esperienzeLavorative;

}
