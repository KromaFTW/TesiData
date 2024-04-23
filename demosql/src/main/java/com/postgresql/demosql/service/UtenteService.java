package com.postgresql.demosql.service;

import java.util.List;

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
        List<Utente> utenti = utenteRepo.findAll();
        return UtenteMapper.INSTANCE.entityToModelList(utenti);
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

    public Utente createUtenteModel(UtenteModel utente) {
        Utente utente2 = UtenteMapper.INSTANCE.modelToEntity(utente);
        return utenteRepo.save(utente2);
    } 

}
