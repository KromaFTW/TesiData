package com.postgresql.demosql.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.postgresql.demosql.entita.Competenza;
import com.postgresql.demosql.repository.CompetenzaRepository;

@Service
public class CompetenzaService {
    
    private final CompetenzaRepository competenzaRepository;

    public CompetenzaService(CompetenzaRepository competenzaRepository){
        this.competenzaRepository = competenzaRepository;
    }

    public List<Competenza> getAllCompetenze(){
        return competenzaRepository.findAll();
    }

    public Competenza getCompetenzaById(Long id){
        return competenzaRepository.findById(id).orElse(null);
    }
   
    public void deleteCompetenzaById(Long id){
        competenzaRepository.deleteById(id);
    }

    public Competenza createCompetenza(Competenza competenza){
        return competenzaRepository.save(competenza);
    }
}
