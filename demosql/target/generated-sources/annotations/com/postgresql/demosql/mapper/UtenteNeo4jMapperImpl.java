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
        utenteNeo4j.setEsperienzeLavorative( esperienzaLavorativaModelSetToEsperienzaLavorativaNeo4jSet( utenteModel.getEsperienzeLavorative() ) );
        utenteNeo4j.setGenere( utenteModel.getGenere() );
        utenteNeo4j.setId( utenteModel.getId() );
        utenteNeo4j.setLuogo_id( map( utenteModel.getLuogo_id() ) );
        utenteNeo4j.setNome( utenteModel.getNome() );
        utenteNeo4j.setTelefono( utenteModel.getTelefono() );
        utenteNeo4j.setUsername( utenteModel.getUsername() );

        return utenteNeo4j;
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

    protected AziendaNeo4j aziendaModelToAziendaNeo4j(AziendaModel aziendaModel) {
        if ( aziendaModel == null ) {
            return null;
        }

        AziendaNeo4j aziendaNeo4j = new AziendaNeo4j();

        aziendaNeo4j.setEsperienzeLavorative( esperienzaLavorativaModelSetToEsperienzaLavorativaNeo4jSet( aziendaModel.getEsperienzeLavorative() ) );
        aziendaNeo4j.setId( aziendaModel.getId() );
        aziendaNeo4j.setLuogo_id( map( aziendaModel.getLuogo_id() ) );
        aziendaNeo4j.setNome( aziendaModel.getNome() );
        aziendaNeo4j.setSettore( aziendaModel.getSettore() );

        return aziendaNeo4j;
    }

    protected Set<AziendaNeo4j> aziendaModelSetToAziendaNeo4jSet(Set<AziendaModel> set) {
        if ( set == null ) {
            return null;
        }

        Set<AziendaNeo4j> set1 = new LinkedHashSet<AziendaNeo4j>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( AziendaModel aziendaModel : set ) {
            set1.add( aziendaModelToAziendaNeo4j( aziendaModel ) );
        }

        return set1;
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
