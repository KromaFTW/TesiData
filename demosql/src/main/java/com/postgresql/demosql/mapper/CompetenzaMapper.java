package com.postgresql.demosql.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.entita.Competenza;
import com.postgresql.demosql.model.CompetenzaModel;


@Component
@Mapper(componentModel = "spring")
public interface CompetenzaMapper {
    CompetenzaMapper INSTANCE = Mappers.getMapper(CompetenzaMapper.class);

    CompetenzaModel entityToModel(Competenza entity);

    List<CompetenzaModel> entityToModelList(List<Competenza> entity);
    
}