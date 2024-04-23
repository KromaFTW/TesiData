package com.postgresql.demosql.mapper;

import com.postgresql.demosql.entita.Luogo;
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
public class LuogoMapperImpl implements LuogoMapper {

    @Override
    public LuogoModel entityToModel(Luogo entity) {
        if ( entity == null ) {
            return null;
        }

        LuogoModel.LuogoModelBuilder luogoModel = LuogoModel.builder();

        luogoModel.id( entity.getId() );
        luogoModel.nome( entity.getNome() );

        return luogoModel.build();
    }

    @Override
    public List<LuogoModel> modelListToNeo4jList(List<Luogo> luogoModel) {
        if ( luogoModel == null ) {
            return null;
        }

        List<LuogoModel> list = new ArrayList<LuogoModel>( luogoModel.size() );
        for ( Luogo luogo : luogoModel ) {
            list.add( entityToModel( luogo ) );
        }

        return list;
    }
}
