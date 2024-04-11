package com.postgresql.demosql.model;

import java.sql.Date;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
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
    //private Long luogoId;
    private String luogoNome;


    private Set<UtenteModel> amici;
    
    /*
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public Date getDataNascita() {
        return dataNascita;
    }
    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getGenere() {
        return genere;
    }
    public void setGenere(String genere) {
        this.genere = genere;
    }
    public Luogo getLuogo() {
        return luogo;
    }
    public void setLuogo(Luogo luogo) {
        this.luogo = luogo;
    }
     */
}
