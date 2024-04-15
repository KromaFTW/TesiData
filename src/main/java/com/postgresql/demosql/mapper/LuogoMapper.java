package com.postgresql.demosql.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.model.LuogoModel;

@Mapper(componentModel = "spring")
public interface LuogoMapper {

    LuogoMapper INSTANCE = Mappers.getMapper(LuogoMapper.class);
    
    LuogoModel entityToModel(Luogo entity);
    
    List<LuogoModel> modelListToNeo4jList(List<Luogo> luogoModel);


    
}
