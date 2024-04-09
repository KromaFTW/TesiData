package com.postgresql.demosql.entita;

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

import java.util.Date;
import java.util.Set;



@Data
@Entity
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String cognome;
    
    private Date dataNascita;
    
    private String email;
    
    private String telefono;
    
    private String username;
    
    private String genere;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @ManyToOne
    @JoinColumn(name = "luogo_id") 
    private Luogo luogo_id; 
    
    @ManyToMany(mappedBy = "utenti")
    private Set<EsperienzaLavorativa> esperienzeLavorative;
   
    @ManyToMany
    @JoinTable(
        name = "amicizia",
        joinColumns = { @JoinColumn(name = "utente_id") },
        inverseJoinColumns =  {@JoinColumn(name = "amico_id")}
    )
    private Set<Utente> amici;
  


}
