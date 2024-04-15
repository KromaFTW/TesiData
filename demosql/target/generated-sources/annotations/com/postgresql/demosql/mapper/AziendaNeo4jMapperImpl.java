package com.postgresql.demosql.mapper;

import com.postgresql.demosql.EntitaNeo4j.AziendaNeo4j;
import com.postgresql.demosql.EntitaNeo4j.EsperienzaLavorativaNeo4j;
import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.EntitaNeo4j.UtenteNeo4j;
import com.postgresql.demosql.model.AziendaModel;
import com.postgresql.demosql.model.EsperienzaLavorativaModel;
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
    date = "2024-04-15T11:13:42+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class AziendaNeo4jMapperImpl implements AziendaNeo4jMapper {

    @Override
    public AziendaNeo4j modelToNeo4j(AziendaModel entity) {
        if ( entity == null ) {
            return null;
        }

        AziendaNeo4j aziendaNeo4j = new AziendaNeo4j();

        aziendaNeo4j.setEsperienzeLavorative( esperienzaLavorativaModelSetToEsperienzaLavorativaNeo4jSet( entity.getEsperienzeLavorative() ) );
        aziendaNeo4j.setId( entity.getId() );
        aziendaNeo4j.setLuogo_id( luogoModelToLuogoNeo4j( entity.getLuogo_id() ) );
        aziendaNeo4j.setNome( entity.getNome() );
        aziendaNeo4j.setSettore( entity.getSettore() );

        return aziendaNeo4j;
    }

    @Override
    public List<AziendaNeo4j> modelToNeo4jList(List<AziendaModel> entity) {
        if ( entity == null ) {
            return null;
        }

        List<AziendaNeo4j> list = new ArrayList<AziendaNeo4j>( entity.size() );
        for ( AziendaModel aziendaModel : entity ) {
            list.add( modelToNeo4j( aziendaModel ) );
        }

        return list;
    }

    protected Set<AziendaNeo4j> aziendaModelSetToAziendaNeo4jSet(Set<AziendaModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<AziendaNeo4j> set1 = new LinkedHashSet<AziendaNeo4j>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AziendaModel aziendaModel : set ) {
            set1.add( modelToNeo4j( aziendaModel ) );
        }

        return set1;
    }

    protected Set<UtenteNeo4j> utenteModelSetToUtenteNeo4jSet(Set<UtenteModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<UtenteNeo4j> set1 = new LinkedHashSet<UtenteNeo4j>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( UtenteModel utenteModel : set ) {
            set1.add( utenteModelToUtenteNeo4j( utenteModel ) );
        }

        return set1;
    }

    protected Set<EsperienzaLavorativaNeo4j> esperienzaLavorativaModelSetToEsperienzaLavorativaNeo4jSet(Set<EsperienzaLavorativaModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<EsperienzaLavorativaNeo4j> set1 = new LinkedHashSet<EsperienzaLavorativaNeo4j>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( EsperienzaLavorativaModel esperienzaLavorativaModel : set ) {
            set1.add( esperienzaLavorativaModelToEsperienzaLavorativaNeo4j( esperienzaLavorativaModel ) );
        }

        return set1;
    }

    protected LuogoNeo4j luogoModelToLuogoNeo4j(LuogoModel luogoModel) {
        if ( luogoModel == null ) {
            return null;
        }

        LuogoNeo4j luogoNeo4j = new LuogoNeo4j();

        luogoNeo4j.setId( luogoModel.getId() );
        luogoNeo4j.setNome( luogoModel.getNome() );

        return luogoNeo4j;
    }

    protected UtenteNeo4j utenteModelToUtenteNeo4j(UtenteModel utenteModel) {
        if ( utenteModel == null ) {
            return null;
        }

        UtenteNeo4j utenteNeo4j = new UtenteNeo4j();

        utenteNeo4j.setAmici( utenteModelSetToUtenteNeo4jSet( utenteModel.getAmici() ) );
        utenteNeo4j.setCognome( utenteModel.getCognome() );
        utenteNeo4j.setDataNascita( utenteModel.getDataNascita() );
        utenteNeo4j.setEmail( utenteModel.getEmail() );
        utenteNeo4j.setEsperienzeLavorative( esperienzaLavorativaModelSetToEsperienzaLavorativaNeo4jSet( utenteModel.getEsperienzeLavorative() ) );
        utenteNeo4j.setGenere( utenteModel.getGenere() );
        utenteNeo4j.setId( utenteModel.getId() );
        utenteNeo4j.setLuogo_id( luogoModelToLuogoNeo4j( utenteModel.getLuogo_id() ) );
        utenteNeo4j.setNome( utenteModel.getNome() );
        utenteNeo4j.setTelefono( utenteModel.getTelefono() );
        utenteNeo4j.setUsername( utenteModel.getUsername() );

        return utenteNeo4j;
    }

    protected EsperienzaLavorativaNeo4j esperienzaLavorativaModelToEsperienzaLavorativaNeo4j(EsperienzaLavorativaModel esperienzaLavorativaModel) {
        if ( esperienzaLavorativaModel == null ) {
            return null;
        }

        EsperienzaLavorativaNeo4j esperienzaLavorativaNeo4j = new EsperienzaLavorativaNeo4j();

        esperienzaLavorativaNeo4j.setAziende( aziendaModelSetToAziendaNeo4jSet( esperienzaLavorativaModel.getAziende() ) );
        esperienzaLavorativaNeo4j.setDataFine( esperienzaLavorativaModel.getDataFine() );
        esperienzaLavorativaNeo4j.setDataInizio( esperienzaLavorativaModel.getDataInizio() );
        esperienzaLavorativaNeo4j.setDescrizione( esperienzaLavorativaModel.getDescrizione() );
        esperienzaLavorativaNeo4j.setId( esperienzaLavorativaModel.getId() );
        esperienzaLavorativaNeo4j.setPosizione( esperienzaLavorativaModel.getPosizione() );
        esperienzaLavorativaNeo4j.setUtenti( utenteModelSetToUtenteNeo4jSet( esperienzaLavorativaModel.getUtenti() ) );

        return esperienzaLavorativaNeo4j;
    }
}
