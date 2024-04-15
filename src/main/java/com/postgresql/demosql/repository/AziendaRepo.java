package com.postgresql.demosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.demosql.entita.Azienda;

// DATA ACCESS LAYER Azienda -> JPA entity, Long -> Primary key 
@Repository                                        
public interface AziendaRepo extends JpaRepository<Azienda, Long> {
    
}