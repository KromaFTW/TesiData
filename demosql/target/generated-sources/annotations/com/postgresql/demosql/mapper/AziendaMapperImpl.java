package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Azienda;
import com.postgresql.demosql.entita.Luogo;
import com.postgresql.demosql.model.AziendaModel;
import com.postgresql.demosql.model.LuogoModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-18T15:15:18+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class AziendaMapperImpl implements AziendaMapper {

    @Override
    public AziendaModel entityToModel(Azienda entity) {
        if ( entity == null ) {
            return null;
        }

        AziendaModel.AziendaModelBuilder aziendaModel = AziendaModel.builder();

        aziendaModel.id( entity.getId() );
        aziendaModel.luogo_id( luogoToLuogoModel( entity.getLuogo_id() ) );
        aziendaModel.nome( entity.getNome() );
        aziendaModel.settore( entity.getSettore() );

        return aziendaModel.build();
    }

    @Override
    public List<AziendaModel> entityToModelList(List<Azienda> entitylist) {
        if ( entitylist == null ) {
            return null;
        }

        List<AziendaModel> list = new ArrayList<AziendaModel>( entitylist.size() );
        for ( Azienda azienda : entitylist ) {
            list.add( entityToModel( azienda ) );
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
}
