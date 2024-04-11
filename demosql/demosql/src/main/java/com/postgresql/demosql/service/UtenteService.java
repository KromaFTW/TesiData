package com.postgresql.demosql.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.mapper.UtenteMapper;
import com.postgresql.demosql.model.UtenteModel;
import com.postgresql.demosql.repository.UtenteRepo;

@Service
public class UtenteService {

    private final UtenteRepo utenteRepo;
    
    public UtenteService(UtenteRepo utenteRepo) {
        this.utenteRepo = utenteRepo;
    }

    public List<UtenteModel> getAllUsers() {
        return utenteRepo.findAll().stream()
                .map(UtenteMapper.INSTANCE::entityToModel)
                .collect(Collectors.toList());
    }

    public Utente getUtenteById(Long id) {
        return utenteRepo.findById(id).orElse(null);
    }

    public void deleteUtenteById(Long id) {
        utenteRepo.deleteById(id);
    }
    
    public Utente createUtente(Utente utente){
        return utenteRepo.save(utente);
    }

}
