package com.postgresql.demosql.mapper;

import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.EntitaNeo4j.UtenteNeo4j;
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
    date = "2024-04-18T15:15:19+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UtenteNeo4jMapperImpl implements UtenteNeo4jMapper {

    @Override
    public UtenteNeo4j modelToNeo4j(UtenteModel utenteModel) {
        if ( utenteModel == null ) {
            return null;
        }

        UtenteNeo4j utenteNeo4j = new UtenteNeo4j();

        utenteNeo4j.setAmici( utenteModelSetToUtenteNeo4jSet( utenteModel.getAmici() ) );
        utenteNeo4j.setCognome( utenteModel.getCognome() );
        utenteNeo4j.setDataNascita( utenteModel.getDataNascita() );
        utenteNeo4j.setEmail( utenteModel.getEmail() );
        utenteNeo4j.setGenere( utenteModel.getGenere() );
        utenteNeo4j.setId( utenteModel.getId() );
        utenteNeo4j.setLuogo_id( map( utenteModel.getLuogo_id() ) );
        utenteNeo4j.setNome( utenteModel.getNome() );
        utenteNeo4j.setTelefono( utenteModel.getTelefono() );
        utenteNeo4j.setUsername( utenteModel.getUsername() );

        return utenteNeo4j;
    }

    @Override
    public UtenteModel Neo4jToModel(UtenteNeo4j utenteNeo4j) {
        if ( utenteNeo4j == null ) {
            return null;
        }

        UtenteModel utenteModel = new UtenteModel();

        utenteModel.setAmici( utenteNeo4jSetToUtenteModelSet( utenteNeo4j.getAmici() ) );
        utenteModel.setCognome( utenteNeo4j.getCognome() );
        utenteModel.setDataNascita( utenteNeo4j.getDataNascita() );
        utenteModel.setEmail( utenteNeo4j.getEmail() );
        utenteModel.setGenere( utenteNeo4j.getGenere() );
        utenteModel.setId( utenteNeo4j.getId() );
        utenteModel.setLuogo_id( luogoNeo4jToLuogoModel( utenteNeo4j.getLuogo_id() ) );
        utenteModel.setNome( utenteNeo4j.getNome() );
        utenteModel.setTelefono( utenteNeo4j.getTelefono() );
        utenteModel.setUsername( utenteNeo4j.getUsername() );

        return utenteModel;
    }

    @Override
    public LuogoNeo4j map(LuogoModel value) {
        if ( value == null ) {
            return null;
        }

        LuogoNeo4j luogoNeo4j = new LuogoNeo4j();

        luogoNeo4j.setId( value.getId() );
        luogoNeo4j.setNome( value.getNome() );

        return luogoNeo4j;
    }

    @Override
    public List<UtenteNeo4j> modelListToNeo4jList(List<UtenteModel> utentiModel) {
        if ( utentiModel == null ) {
            return null;
        }

        List<UtenteNeo4j> list = new ArrayList<UtenteNeo4j>( utentiModel.size() );
        for ( UtenteModel utenteModel : utentiModel ) {
            list.add( modelToNeo4j( utenteModel ) );
        }

        return list;
    }

    protected Set<UtenteNeo4j> utenteModelSetToUtenteNeo4jSet(Set<UtenteModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<UtenteNeo4j> set1 = new LinkedHashSet<UtenteNeo4j>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( UtenteModel utenteModel : set ) {
            set1.add( modelToNeo4j( utenteModel ) );
        }

        return set1;
    }

    protected Set<UtenteModel> utenteNeo4jSetToUtenteModelSet(Set<UtenteNeo4j> set) {
        if ( set == null ) {
            return null;
        }

        Set<UtenteModel> set1 = new LinkedHashSet<UtenteModel>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( UtenteNeo4j utenteNeo4j : set ) {
            set1.add( Neo4jToModel( utenteNeo4j ) );
        }

        return set1;
    }

    protected LuogoModel luogoNeo4jToLuogoModel(LuogoNeo4j luogoNeo4j) {
        if ( luogoNeo4j == null ) {
            return null;
        }

        LuogoModel.LuogoModelBuilder luogoModel = LuogoModel.builder();

        luogoModel.id( luogoNeo4j.getId() );
        luogoModel.nome( luogoNeo4j.getNome() );

        return luogoModel.build();
    }
}
