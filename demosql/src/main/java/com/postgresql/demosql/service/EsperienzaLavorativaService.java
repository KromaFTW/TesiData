package com.postgresql.demosql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.demosql.entita.EsperienzaLavorativa;
import com.postgresql.demosql.repository.EsperienzaLavorativaRepo;

@Service
public class EsperienzaLavorativaService {
    private final EsperienzaLavorativaRepo esperienzalavorativaRepo;

    @Autowired
    public EsperienzaLavorativaService(EsperienzaLavorativaRepo esperienzalavorativaRepo) {
        this.esperienzalavorativaRepo = esperienzalavorativaRepo;
    }

    public List<EsperienzaLavorativa> getAllEsperienzeLavorative() {
        return esperienzalavorativaRepo.findAll();
    } 

    public EsperienzaLavorativa getEsperienzaLavorativaById(Long id) {
        return esperienzalavorativaRepo.findById(id).orElse(null);
    }
   
    public void deleteEsperienzaLavorativaById(Long id) {
        esperienzalavorativaRepo.deleteById(id);
    }
    
    public EsperienzaLavorativa createEsperienzaLavorativa(EsperienzaLavorativa esperienzaLavorativa) {
        return esperienzalavorativaRepo.save(esperienzaLavorativa);
    } 
}
