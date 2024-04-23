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
    date = "2024-04-18T15:15:18+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class EsperienzaLavorativaNeo4jMapperImpl implements EsperienzaLavorativaNeo4jMapper {

    @Override
    public EsperienzaLavorativaNeo4j modelToNeo4j(EsperienzaLavorativaModel esperienzaModel) {
        if ( esperienzaModel == null ) {
            return null;
        }

        EsperienzaLavorativaNeo4j esperienzaLavorativaNeo4j = new EsperienzaLavorativaNeo4j();

        esperienzaLavorativaNeo4j.setAzienda( aziendaModelToAziendaNeo4j( esperienzaModel.getAzienda() ) );
        esperienzaLavorativaNeo4j.setDataFine( esperienzaModel.getDataFine() );
        esperienzaLavorativaNeo4j.setDataInizio( esperienzaModel.getDataInizio() );
        esperienzaLavorativaNeo4j.setDescrizione( esperienzaModel.getDescrizione() );
        esperienzaLavorativaNeo4j.setId( esperienzaModel.getId() );
        esperienzaLavorativaNeo4j.setPosizione( esperienzaModel.getPosizione() );
        esperienzaLavorativaNeo4j.setUtente( utenteModelToUtenteNeo4j( esperienzaModel.getUtente() ) );

        return esperienzaLavorativaNeo4j;
    }

    @Override
    public List<EsperienzaLavorativaNeo4j> modelListToNeo4jList(List<EsperienzaLavorativaModel> esperienzaModellista) {
        if ( esperienzaModellista == null ) {
            return null;
        }

        List<EsperienzaLavorativaNeo4j> list = new ArrayList<EsperienzaLavorativaNeo4j>( esperienzaModellista.size() );
        for ( EsperienzaLavorativaModel esperienzaLavorativaModel : esperienzaModellista ) {
            list.add( modelToNeo4j( esperienzaLavorativaModel ) );
        }

        return list;
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

    protected AziendaNeo4j aziendaModelToAziendaNeo4j(AziendaModel aziendaModel) {
        if ( aziendaModel == null ) {
            return null;
        }

        AziendaNeo4j aziendaNeo4j = new AziendaNeo4j();

        aziendaNeo4j.setId( aziendaModel.getId() );
        aziendaNeo4j.setLuogo_id( luogoModelToLuogoNeo4j( aziendaModel.getLuogo_id() ) );
        aziendaNeo4j.setNome( aziendaModel.getNome() );
        aziendaNeo4j.setSettore( aziendaModel.getSettore() );

        return aziendaNeo4j;
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

    protected UtenteNeo4j utenteModelToUtenteNeo4j(UtenteModel utenteModel) {
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
        utenteNeo4j.setLuogo_id( luogoModelToLuogoNeo4j( utenteModel.getLuogo_id() ) );
        utenteNeo4j.setNome( utenteModel.getNome() );
        utenteNeo4j.setTelefono( utenteModel.getTelefono() );
        utenteNeo4j.setUsername( utenteModel.getUsername() );

        return utenteNeo4j;
    }
}
