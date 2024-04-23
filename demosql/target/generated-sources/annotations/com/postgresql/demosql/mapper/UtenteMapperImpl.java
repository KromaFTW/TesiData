package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.entita.Utente;
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
    date = "2024-04-18T15:24:51+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UtenteMapperImpl implements UtenteMapper {

    @Override
    public UtenteModel entityToModel(Utente entity) {
        if ( entity == null ) {
            return null;
        }

        UtenteModel utenteModel = new UtenteModel();

        utenteModel.setAmici( utenteSetToUtenteModelSet( entity.getAmici() ) );
        utenteModel.setCognome( entity.getCognome() );
        utenteModel.setDataNascita( entity.getDataNascita() );
        utenteModel.setEmail( entity.getEmail() );
        utenteModel.setGenere( entity.getGenere() );
        utenteModel.setId( entity.getId() );
        utenteModel.setLuogo_id( luogoToLuogoModel( entity.getLuogo_id() ) );
        utenteModel.setNome( entity.getNome() );
        utenteModel.setTelefono( entity.getTelefono() );
        utenteModel.setUsername( entity.getUsername() );

        return utenteModel;
    }

    @Override
    public Utente modelToEntity(UtenteModel model) {
        if ( model == null ) {
            return null;
        }

        Utente utente = new Utente();

        utente.setAmici( utenteModelSetToUtenteSet( model.getAmici() ) );
        utente.setCognome( model.getCognome() );
        utente.setDataNascita( model.getDataNascita() );
        utente.setEmail( model.getEmail() );
        utente.setGenere( model.getGenere() );
        utente.setId( model.getId() );
        utente.setLuogo_id( luogoModelToLuogo( model.getLuogo_id() ) );
        utente.setNome( model.getNome() );
        utente.setTelefono( model.getTelefono() );
        utente.setUsername( model.getUsername() );

        return utente;
    }

    @Override
    public List<UtenteModel> entityToModelList(List<Utente> entitylist) {
        if ( entitylist == null ) {
            return null;
        }

        List<UtenteModel> list = new ArrayList<UtenteModel>( entitylist.size() );
        for ( Utente utente : entitylist ) {
            list.add( entityToModel( utente ) );
        }

        return list;
    }

    protected Set<UtenteModel> utenteSetToUtenteModelSet(Set<Utente> set) {
        if ( set == null ) {
            return null;
        }

        Set<UtenteModel> set1 = new LinkedHashSet<UtenteModel>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Utente utente : set ) {
            set1.add( entityToModel( utente ) );
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

    protected Set<Utente> utenteModelSetToUtenteSet(Set<UtenteModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<Utente> set1 = new LinkedHashSet<Utente>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( UtenteModel utenteModel : set ) {
            set1.add( modelToEntity( utenteModel ) );
        }

        return set1;
    }

    protected Luogo luogoModelToLuogo(LuogoModel luogoModel) {
        if ( luogoModel == null ) {
            return null;
        }

        Luogo luogo = new Luogo();

        luogo.setId( luogoModel.getId() );
        luogo.setNome( luogoModel.getNome() );

        return luogo;
    }
}
