package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Azienda;
import com.postgresql.demosql.entita.EsperienzaLavorativa;
import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.entita.Utente;
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
public class EsperienzaLavorativaMapperImpl implements EsperienzaLavorativaMapper {

    @Override
    public EsperienzaLavorativaModel entityToModel(EsperienzaLavorativa entity) {
        if ( entity == null ) {
            return null;
        }

        EsperienzaLavorativaModel.EsperienzaLavorativaModelBuilder esperienzaLavorativaModel = EsperienzaLavorativaModel.builder();

        esperienzaLavorativaModel.azienda( aziendaToAziendaModel( entity.getAzienda() ) );
        esperienzaLavorativaModel.dataFine( entity.getDataFine() );
        esperienzaLavorativaModel.dataInizio( entity.getDataInizio() );
        esperienzaLavorativaModel.descrizione( entity.getDescrizione() );
        esperienzaLavorativaModel.id( entity.getId() );
        esperienzaLavorativaModel.posizione( entity.getPosizione() );
        esperienzaLavorativaModel.utente( utenteToUtenteModel( entity.getUtente() ) );

        return esperienzaLavorativaModel.build();
    }

    @Override
    public List<EsperienzaLavorativaModel> entityToModelList(List<EsperienzaLavorativa> entitylist) {
        if ( entitylist == null ) {
            return null;
        }

        List<EsperienzaLavorativaModel> list = new ArrayList<EsperienzaLavorativaModel>( entitylist.size() );
        for ( EsperienzaLavorativa esperienzaLavorativa : entitylist ) {
            list.add( entityToModel( esperienzaLavorativa ) );
        }

        return list;
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

    protected AziendaModel aziendaToAziendaModel(Azienda azienda) {
        if ( azienda == null ) {
            return null;
        }

        AziendaModel.AziendaModelBuilder aziendaModel = AziendaModel.builder();

        aziendaModel.id( azienda.getId() );
        aziendaModel.luogo_id( luogoToLuogoModel( azienda.getLuogo_id() ) );
        aziendaModel.nome( azienda.getNome() );
        aziendaModel.settore( azienda.getSettore() );

        return aziendaModel.build();
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
