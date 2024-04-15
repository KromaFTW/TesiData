package com.postgresql.demosql.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.EntitaNeo4j.AziendaNeo4j;
import com.postgresql.demosql.model.AziendaModel;



@Component
@Mapper(componentModel = "spring")
public interface AziendaNeo4jMapper {
    AziendaNeo4jMapper INSTANCE = Mappers.getMapper(AziendaNeo4jMapper.class);

    AziendaNeo4j modelToNeo4j(AziendaModel entity);

    List<AziendaNeo4j> modelToNeo4jList(List<AziendaModel> entity);

}
