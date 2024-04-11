package com.postgresql.demosql.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.model.UtenteModel;

@Mapper(componentModel = "spring")
public interface UtenteMapper {
    UtenteMapper INSTANCE = Mappers.getMapper(UtenteMapper.class);

    @Mapping(source = "luogo_id.nome", target = "luogoNome")
    UtenteModel entityToModel(Utente entity);

    // Utente modelToEntity(UtenteModel model);

    default Set<UtenteModel> amiciToModel(Set<Utente> amici) {
        return amici.stream()
                .map(amico -> UtenteModel.builder()
                        // .id(amico.getId())
                        .nome(amico.getNome())
                        .cognome(amico.getCognome())
                        .build())
                .collect(Collectors.toSet());
    }

}

/*
default Set<UtenteModel> amiciToModel(Set<Utente> amici) {
    Set<UtenteModel> amiciModel = new HashSet<>();
    for (Utente amico : amici) {
        UtenteModel utenteModel = UtenteModel.builder()
                .nome(amico.getNome())
                .cognome(amico.getCognome())
                .build();
        amiciModel.add(utenteModel);
    }
    return amiciModel;
}
*/