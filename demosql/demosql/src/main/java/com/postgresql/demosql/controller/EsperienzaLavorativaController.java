package com.postgresql.demosql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.demosql.EntitaNeo4j.EsperienzaLavorativaNeo4j;
import com.postgresql.demosql.entita.EsperienzaLavorativa;
import com.postgresql.demosql.repository_Neo4j.EsperienzaLavorativaNeo4jRepository;
import com.postgresql.demosql.service.EsperienzaLavorativaService;

@RestController
@RequestMapping("/esperienzalavorativa")
public class EsperienzaLavorativaController {

    private final EsperienzaLavorativaService esperienzaLavorativaService;

    private EsperienzaLavorativaNeo4jRepository esperienzaLavorativaNeo4jRepository;

    public EsperienzaLavorativaController(EsperienzaLavorativaService esperienzaLavorativaService,EsperienzaLavorativaNeo4jRepository esperienzaLavorativaNeo4jRepository){
        this.esperienzaLavorativaService = esperienzaLavorativaService;
        this.esperienzaLavorativaNeo4jRepository = esperienzaLavorativaNeo4jRepository;
    }

    @PostMapping("/salva")
    public void salvoLuogoSuNeo4j(@RequestBody List<EsperienzaLavorativaNeo4j> luogo) {
        esperienzaLavorativaNeo4jRepository.saveAll(luogo);
    }

    @GetMapping
    public List<EsperienzaLavorativa> getAllEsperienzeLavorative(){
        return esperienzaLavorativaService.getAllEsperienzeLavorative();
    }

    @GetMapping("/{id}")
    public EsperienzaLavorativa getEsperienzaLavorativaById(@PathVariable Long id) {
        return esperienzaLavorativaService.getEsperienzaLavorativaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEsperienzaLavorativaById(@PathVariable Long id){
        esperienzaLavorativaService.deleteEsperienzaLavorativaById(id);
    }

    @PostMapping
    public EsperienzaLavorativa createEsperienzaLavorativa(@RequestBody EsperienzaLavorativa esperienzaLavorativa){
        return esperienzaLavorativaService.createEsperienzaLavorativa(esperienzaLavorativa);
    }
}
