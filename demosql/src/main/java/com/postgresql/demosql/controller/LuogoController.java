package com.postgresql.demosql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.repository_Neo4j.LuogoNeo4jRepository;
import com.postgresql.demosql.service.LuogoService;

@RestController
@RequestMapping("/luogo")
public class LuogoController {
    
    private final LuogoService luogoService;

    private  LuogoNeo4jRepository luogoNeo4jRepository;
    
    public LuogoController(LuogoService luogoService, LuogoNeo4jRepository luogoNeo4jRepository){
        this.luogoService = luogoService;
        this.luogoNeo4jRepository = luogoNeo4jRepository;
    }

    // SALVO INTERA LISTA LUOGO
    @PostMapping("/salva")
    public void salvoLuogoSuNeo4j(@RequestBody List<LuogoNeo4j> luogo) {
        luogoNeo4jRepository.saveAll(luogo);
    }

    @GetMapping
    public List<Luogo> getAllLuoghi(){
        return luogoService.getAllLuoghi();
    }

    @GetMapping("/{id}")
    public Luogo getLuogoById(@PathVariable Long id) {
        return luogoService.getLuogoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteLuogoById(@PathVariable Long id){
        luogoService.deleteLuogoById(id);
    }

    @PostMapping
    public Luogo createLuogo(@RequestBody Luogo luogo){
        return luogoService.createLuogo(luogo);
    }
}
