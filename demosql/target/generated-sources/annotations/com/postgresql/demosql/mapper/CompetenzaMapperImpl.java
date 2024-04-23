package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Competenza;
import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.entita.Utente;
import com.postgresql.demosql.model.CompetenzaModel;
import com.postgresql.demosql.model.LuogoModel;
import com.postgresql.demosql.model.UtenteModel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-18T15:34:09+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class CompetenzaMapperImpl implements CompetenzaMapper {

    @Override
    public CompetenzaModel entityToModel(Competenza entity) {
        if ( entity == null ) {
            return null;
        }

        CompetenzaModel competenzaModel = new CompetenzaModel();

        competenzaModel.setId( entity.getId() );
        competenzaModel.setNome( entity.getNome() );
        competenzaModel.setUtenti( utenteSetToUtenteModelSet( entity.getUtenti() ) );

        return competenzaModel;
    }

    @Override
    public List<CompetenzaModel> entityToModelList(List<Competenza> entity) {
        if ( entity == null ) {
            return null;
        }

        List<CompetenzaModel> list = new ArrayList<CompetenzaModel>( entity.size() );
        for ( Competenza competenza : entity ) {
            list.add( entityToModel( competenza ) );
        }

        return list;
    }

    protected Set<UtenteModel> utenteSetToUtenteModelSet(Set<Utente> set) {
        if ( set == null ) {
            return null;
        }

        Set<UtenteModel> set1 = new LinkedHashSet<UtenteModel>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Utente utente : set ) {
            set1.add( utenteToUtenteModel( utente ) );
        }

        return set1;
    }

    protected LuogoModel luogoToLuogoModel(Luogo luogo) {
        if ( luogo == null ) {
            return null;
        }

        LuogoModel.LuogoModelBuilder luogoModel = LuogoModel.builder();

        luogoModel.id( luogo.getId() );
        luogoModel.nome( luogo.getNome() );

        return luogoModel.build();
    }

    protected UtenteModel utenteToUtenteModel(Utente utente) {
        if ( utente == null ) {
            return null;
        }

        UtenteModel utenteModel = new UtenteModel();

        utenteModel.setAmici( utenteSetToUtenteModelSet( utente.getAmici() ) );
        utenteModel.setCognome( utente.getCognome() );
        utenteModel.setDataNascita( utente.getDataNascita() );
        utenteModel.setEmail( utente.getEmail() );
        utenteModel.setGenere( utente.getGenere() );
        utenteModel.setId( utente.getId() );
        utenteModel.setLuogo_id( luogoToLuogoModel( utente.getLuogo_id() ) );
        utenteModel.setNome( utente.getNome() );
        utenteModel.setTelefono( utente.getTelefono() );
        utenteModel.setUsername( utente.getUsername() );

        return utenteModel;
    }
}
