package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.model.UtenteModel;
import java.sql.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-11T11:50:15+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UtenteMapperImpl implements UtenteMapper {

    @Override
    public UtenteModel entityToModel(Utente entity) {
        if ( entity == null ) {
            return null;
        }

        UtenteModel.UtenteModelBuilder utenteModel = UtenteModel.builder();

        utenteModel.luogoNome( entityLuogo_idNome( entity ) );
        utenteModel.amici( amiciToModel( entity.getAmici() ) );
        utenteModel.cognome( entity.getCognome() );
        if ( entity.getDataNascita() != null ) {
            utenteModel.dataNascita( new Date( entity.getDataNascita().getTime() ) );
        }
        utenteModel.email( entity.getEmail() );
        utenteModel.genere( entity.getGenere() );
        utenteModel.id( entity.getId() );
        utenteModel.nome( entity.getNome() );
        utenteModel.telefono( entity.getTelefono() );
        utenteModel.username( entity.getUsername() );

        return utenteModel.build();
    }

    private String entityLuogo_idNome(Utente utente) {
        if ( utente == null ) {
            return null;
        }
        Luogo luogo_id = utente.getLuogo_id();
        if ( luogo_id == null ) {
            return null;
        }
        String nome = luogo_id.getNome();
        if ( nome == null ) {
            return null;
        }
        return nome;
    }
}
