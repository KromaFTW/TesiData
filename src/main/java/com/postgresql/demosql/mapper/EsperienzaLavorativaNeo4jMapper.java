package com.postgresql.demosql.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.EntitaNeo4j.EsperienzaLavorativaNeo4j;
import com.postgresql.demosql.model.EsperienzaLavorativaModel;



@Component
@Mapper(componentModel = "spring")
public interface EsperienzaLavorativaNeo4jMapper {
    EsperienzaLavorativaNeo4jMapper INSTANCE = Mappers.getMapper(EsperienzaLavorativaNeo4jMapper.class);

    
    EsperienzaLavorativaNeo4j modelToNeo4j(EsperienzaLavorativaModel esperienzaModel);

    List<EsperienzaLavorativaNeo4j> modelListToNeo4jList(List<EsperienzaLavorativaModel> esperienzaModellista);
}
