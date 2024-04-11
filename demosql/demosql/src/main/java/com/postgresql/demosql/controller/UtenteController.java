package com.postgresql.demosql.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.demosql.EntitaNeo4j.UtenteNeo4j;
import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.model.UtenteModel;
import com.postgresql.demosql.repository_Neo4j.UtenteNeo4jRepository;
import com.postgresql.demosql.service.UtenteService;

@RestController
@RequestMapping("/utente")
public class UtenteController {
 
    
    private final UtenteService utenteService;

    private UtenteNeo4jRepository utenteNeo4jRepository;
   
    
    public UtenteController(UtenteService utenteService, UtenteNeo4jRepository utenteNeo4jRepository) {
        this.utenteService = utenteService;
        this.utenteNeo4jRepository = utenteNeo4jRepository;
    }

    @PostMapping("/salva")
    public void salvaUtenteSuNeo4j(@RequestBody UtenteNeo4j utente) {
        utenteNeo4jRepository.save(utente);
    }

    @PostMapping("/salvaTutto")
    public void salvaUtentiSuNeo4j(@RequestBody List<UtenteNeo4j> utenti) {
        utenteNeo4jRepository.saveAll(utenti);
    }

    @GetMapping
    public List<UtenteModel> getAllUsers() {
        return utenteService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Utente getUtenteById(@PathVariable Long id) {
        return utenteService.getUtenteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUtenteById(@PathVariable Long id) {
        utenteService.deleteUtenteById(id);
    }

    @PostMapping
    public Utente creaUtente(@RequestBody Utente utente){
        return utenteService.createUtente(utente);
    }
    
    
}   

