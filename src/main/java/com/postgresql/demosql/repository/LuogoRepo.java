package com.postgresql.demosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.demosql.entita.Luogo;

// DATA ACCESS LAYER LUOGO
@Repository
public interface LuogoRepo extends JpaRepository<Luogo, Long> {
    
}
