package com.postgresql.demosql.mapper;

import com.postgresql.demosql.EntitaNeo4j.LuogoNeo4j;
import com.postgresql.demosql.model.LuogoModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-18T15:15:19+0200",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240325-1403, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class LuogoNeo4jMapperImpl implements LuogoNeo4jMapper {

    @Override
    public List<LuogoNeo4j> modelListToNeo4jList(List<LuogoModel> luogoModels) {
        if ( luogoModels == null ) {
            return null;
        }

        List<LuogoNeo4j> list = new ArrayList<LuogoNeo4j>( luogoModels.size() );
        for ( LuogoModel luogoModel : luogoModels ) {
            list.add( map( luogoModel ) );
        }

        return list;
    }

    @Override
    public LuogoNeo4j map(LuogoModel luogoModel) {
        if ( luogoModel == null ) {
            return null;
        }

        LuogoNeo4j luogoNeo4j = new LuogoNeo4j();

        luogoNeo4j.setId( luogoModel.getId() );
        luogoNeo4j.setNome( luogoModel.getNome() );

        return luogoNeo4j;
    }
}
