package com.postgresql.demosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.demosql.entita.EsperienzaLavorativa;

// DATA ACCESS LAYER
@Repository
public interface EsperienzaLavorativaRepo extends JpaRepository<EsperienzaLavorativa, Long> {

}
    