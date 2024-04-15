package com.postgresql.demosql.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.entita.EsperienzaLavorativa;
import com.postgresql.demosql.model.EsperienzaLavorativaModel;

@Component
@Mapper(componentModel = "spring")
public interface EsperienzaLavorativaMapper {
    
    EsperienzaLavorativaMapper INSTANCE = Mappers.getMapper(EsperienzaLavorativaMapper.class);

    EsperienzaLavorativaModel entityToModel(EsperienzaLavorativa entity);

    List<EsperienzaLavorativaModel> entityToModelList(List<EsperienzaLavorativa> entitylist);

    
    
}
