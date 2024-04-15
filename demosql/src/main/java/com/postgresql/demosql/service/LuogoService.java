package com.postgresql.demosql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.repository.LuogoRepo;

@Service
public class LuogoService {
    private final LuogoRepo luogoRepo;

    public LuogoService(LuogoRepo luogoRepo){
        this.luogoRepo = luogoRepo;
    }

    public List<Luogo> getAllLuoghi() {
        return luogoRepo.findAll();
    }

    public Luogo getLuogoById(Long id) {
        return luogoRepo.findById(id).orElse(null);
    }
   
    public void deleteLuogoById(Long id) {
        luogoRepo.deleteById(id);
    }
    
    public Luogo createLuogo(Luogo luogo) {
        return luogoRepo.save(luogo);
    }
}
