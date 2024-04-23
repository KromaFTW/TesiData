package com.postgresql.demosql.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AziendaModel {

    private Long id;
    private String nome;
    private String settore;

    private LuogoModel luogo_id; 

}
