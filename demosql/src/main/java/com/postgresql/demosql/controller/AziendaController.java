package com.postgresql.demosql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.demosql.EntitaNeo4j.AziendaNeo4j;
import com.postgresql.demosql.entita.Azienda;
import com.postgresql.demosql.repository_Neo4j.AziendaNeo4jRepository;
import com.postgresql.demosql.service.AziendaService;

@RestController
@RequestMapping("/azienda")
public class AziendaController {

    private final AziendaService aziendaService;

    private AziendaNeo4jRepository aziendaNeo4jRepository;
    public AziendaController(AziendaService aziendaService, AziendaNeo4jRepository aziendaNeo4jRepository) {
        this.aziendaService = aziendaService;
        this.aziendaNeo4jRepository = aziendaNeo4jRepository;
    }

    // SALVO INTERA LISTA LUOGO
    @PostMapping("/salva")
    public void salvoLuogoSuNeo4j(@RequestBody List<AziendaNeo4j> azienda) {
        aziendaNeo4jRepository.saveAll(azienda);
    }
    @GetMapping
    public List<Azienda> getAzienda() {
        return aziendaService.getAzienda();
    }

    @GetMapping("/{id}")
    public Azienda getAziendaById(@PathVariable Long id) {
        return aziendaService.getAziendaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAzienda(@PathVariable Long id) {
        aziendaService.deleteAzienda(id);
    }

    @PostMapping
    public Azienda createAzienda(@RequestBody Azienda azienda) {
        return aziendaService.createAzienda(azienda);
    }
    
}
