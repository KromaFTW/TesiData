package com.postgresql.demosql.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class LuogoModel {

    private Long id;
    private String nome;
    
}
