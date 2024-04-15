package com.postgresql.demosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.demosql.entita.Competenza;

// DATA ACCESS LAYER
@Repository
public interface CompetenzaRepository extends JpaRepository<Competenza, Long> {
    
}
