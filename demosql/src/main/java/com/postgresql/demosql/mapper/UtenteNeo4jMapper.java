package com.postgresql.demosql.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.EntitaNeo4j.UtenteNeo4j;
import com.postgresql.demosql.model.LuogoModel;
import com.postgresql.demosql.model.UtenteModel;

@Component
@Mapper(componentModel = "spring")
public interface UtenteNeo4jMapper {

    UtenteNeo4jMapper INSTANCE = Mappers.getMapper(UtenteNeo4jMapper.class);
    
 
    // UtenteModel in UtenteNeo4j
    UtenteNeo4j modelToNeo4j(UtenteModel utenteModel);
    
    LuogoNeo4j map(LuogoModel value);
    
    // List UtenteModel --> List di UtenteNeo4j
    List<UtenteNeo4j> modelListToNeo4jList(List<UtenteModel> utentiModel);

}

