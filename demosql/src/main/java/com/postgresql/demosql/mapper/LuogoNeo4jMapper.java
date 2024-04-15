package com.postgresql.demosql.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.model.LuogoModel;

@Component
@Mapper(componentModel = "spring")
public interface LuogoNeo4jMapper {
    
    LuogoNeo4jMapper INSTANCE = Mappers.getMapper(LuogoNeo4jMapper.class);
    
    List<LuogoNeo4j> modelListToNeo4jList(List<LuogoModel> luogoModels);
    LuogoNeo4j map(LuogoModel luogoModel);
}
