package com.postgresql.demosql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.repository.UtenteRepo;

@Service
public class UtenteService {

    private final UtenteRepo utenteRepo;

    @Autowired
    public UtenteService(UtenteRepo utenteRepo) {
        this.utenteRepo = utenteRepo;
    }

    public List<Utente> getAllUtenti() {
        return utenteRepo.findAll();
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
