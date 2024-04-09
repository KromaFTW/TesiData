package com.postgresql.demosql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.postgresql.demosql.repository.UtenteRepo;
import com.postgresql.demosql.entita.Utente;

@Component
public class UtentePrinter implements CommandLineRunner {

    private final UtenteRepo utenteRepo;

    public UtentePrinter(UtenteRepo utenteRepo) {
        this.utenteRepo = utenteRepo;
    }

    @Override
    public void run(String... args) {
        System.out.println("Utenti nel database:");
        Iterable<Utente> utenti = utenteRepo.findAll();
        utenti.forEach(utente -> System.out.println(utente));
    }
}