package com.postgresql.demosql.mapper;


import java.util.List;

import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.model.UtenteModel;

@Component
@Mapper(componentModel = "spring")
public interface UtenteMapper {
    UtenteMapper INSTANCE = Mappers.getMapper(UtenteMapper.class);
    
    UtenteModel entityToModel(Utente entity);
    // Utente modelToEntity(UtenteModel model);
    List<UtenteModel> entityToModelList(List<Utente> entitylist);

}

