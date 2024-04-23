package com.postgresql.demosql.mapper;

import com.postgresql.demosql.EntitaNeo4j.AziendaNeo4j;
import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
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
public class AziendaNeo4jMapperImpl implements AziendaNeo4jMapper {

    @Override
    public AziendaNeo4j modelToNeo4j(AziendaModel entity) {
        if ( entity == null ) {
            return null;
        }

        AziendaNeo4j aziendaNeo4j = new AziendaNeo4j();

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

    protected LuogoNeo4j luogoModelToLuogoNeo4j(LuogoModel luogoModel) {
        if ( luogoModel == null ) {
            return null;
        }

        LuogoNeo4j luogoNeo4j = new LuogoNeo4j();

        luogoNeo4j.setId( luogoModel.getId() );
        luogoNeo4j.setNome( luogoModel.getNome() );

        return luogoNeo4j;
    }
}
