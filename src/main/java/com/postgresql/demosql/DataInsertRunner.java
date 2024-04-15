package com.postgresql.demosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
public class DataInsertRunner {

    private boolean runDataInsertEnabled = true;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void runDataInsert() throws Exception {
        if (runDataInsertEnabled) {
            // Leggo file SQL
            @SuppressWarnings("resource")
            String sql = new BufferedReader(new InputStreamReader(new ClassPathResource("data_insert.sql").getInputStream()))
                    .lines().collect(Collectors.joining("\n"));

            // Esegui le query SQL
            jdbcTemplate.execute(sql);
        }
    }
}
