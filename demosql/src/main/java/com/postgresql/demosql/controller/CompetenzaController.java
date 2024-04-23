package com.postgresql.demosql.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.demosql.entita.Competenza;
import com.postgresql.demosql.model.CompetenzaModel;
import com.postgresql.demosql.service.CompetenzaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/competenza")
public class CompetenzaController {
    
    private final CompetenzaService competenzaService;
    
    public CompetenzaController(CompetenzaService competenzaService) {
        this.competenzaService = competenzaService;
    }

    @GetMapping
    public List<CompetenzaModel> getAllCompetenze() {
        return competenzaService.getAllCompetenze();
    }

    @GetMapping("/{id}")
    public Competenza getCompetenzaById(@PathVariable Long id) {
        return competenzaService.getCompetenzaById(id);
    }
   
    @DeleteMapping("/{id}")
    public void deleteCompetenzaById(@PathVariable Long id) {
        competenzaService.deleteCompetenzaById(id);
    }

    @PostMapping
    public Competenza createCompetenza(@RequestBody Competenza competenza) {
        return competenzaService.createCompetenza(competenza);
    }
    
}

