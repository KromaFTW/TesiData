package com.postgresql.demosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.demosql.entita.Utente;

// DATA ACCESS LAYER UTENTE
@Repository
public interface UtenteRepo extends JpaRepository<Utente, Long> {
    
}

