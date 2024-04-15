package com.postgresql.demosql.model;

import java.util.Date;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class UtenteModel {
    private Long id;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private String email;
    private String telefono;
    private String username;
    private String genere;

    // LUOGO
    private LuogoModel luogo_id;

    // AMICO
    private Set<UtenteModel> amici;
    
    private Set<EsperienzaLavorativaModel> esperienzeLavorative;
    // ESPERIENZA LAVORATIVA 
}
