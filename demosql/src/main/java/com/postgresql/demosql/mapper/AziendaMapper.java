package com.postgresql.demosql.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.postgresql.demosql.entita.Azienda;
import com.postgresql.demosql.model.AziendaModel;

@Component
@Mapper(componentModel = "spring")
public interface AziendaMapper {

    AziendaMapper INSTANCE = Mappers.getMapper(AziendaMapper.class);

    AziendaModel entityToModel(Azienda entity);

    List<AziendaModel> entityToModelList(List<Azienda> entitylist);
}
