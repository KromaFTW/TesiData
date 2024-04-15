package com.postgresql.demosql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.postgresql.demosql.entita.Azienda;
import com.postgresql.demosql.mapper.AziendaMapper;
import com.postgresql.demosql.model.AziendaModel;
import com.postgresql.demosql.repository.AziendaRepo;

@Service
public class AziendaService {
    
    private final AziendaRepo aziendaRepo;

    public List<AziendaModel> getAllAzienda() {
        List<Azienda> aziende = aziendaRepo.findAll();
        return AziendaMapper.INSTANCE.entityToModelList(aziende);
    }
    
    public AziendaService(AziendaRepo aziendaRepo){
        this.aziendaRepo = aziendaRepo;
    }
    
    public Azienda getAziendaById(Long id) {
        return aziendaRepo.findById(id).orElse(null);
    }

    public void deleteAzienda(Long id) {
        aziendaRepo.deleteById(id);
    }
    
    public List<Azienda> getAzienda(){
        return aziendaRepo.findAll();
    }

    public Azienda createAzienda(Azienda azienda) {
        return aziendaRepo.save(azienda);
    }
    
}