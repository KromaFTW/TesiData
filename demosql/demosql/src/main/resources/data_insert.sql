
-- INSERT LUOGO
INSERT INTO Luogo (nome) VALUES
    ('Roma'),
    ('Milano'),
    ('Napoli'),
    ('Firenze'),
    ('Bologna'),
    ('Torino'),
    ('Palermo'),
    ('Genova'),
    ('Bari'),
    ('Catania'),
    ('Venezia'),
    ('Verona'),
    ('Trieste'),
    ('Brescia'),
    ('Cagliari');

-- INSERT UTENTE 
INSERT INTO utente (nome, cognome, data_Nascita, email, telefono, username, genere, luogo_id) VALUES 
    ('Maria', 'Rossi', '1990-05-15', 'maria.rossi@example.com', '123456789', 'maria90', 'F', 1),
    ('Luca', 'Bianchi', '1985-10-20', 'luca.bianchi@example.com', '987654321', 'luca85', 'M', 3),
    ('Anna', 'Verdi', '1988-03-25', 'anna.verdi@example.com', '555123456', 'anna88', 'F', 3),
    ('Marco', 'Russo', '1995-07-10', 'marco.russo@example.com', '999888777', 'marco95', 'M', 3),
    ('Laura', 'Ferrari', '1983-12-03', 'laura.ferrari@example.com', '444555666', 'laura83', 'F', 6),
    ('Giovanni', 'Gallo', '1979-09-28', 'giovanni.gallo@example.com', '777222333', 'giovanni79', 'M', 6),
    ('Chiara', 'Conti', '1992-02-18', 'chiara.conti@example.com', '111333222', 'chiara92', 'F', 7),
    ('Fabio', 'Martini', '1980-08-07', 'fabio.martini@example.com', '666444555', 'fabio80', 'M', 11),
    ('Elena', 'Moretti', '1975-06-12', 'elena.moretti@example.com', '222777888', 'elena75', 'F', 9),
    ('Davide', 'Barbieri', '1987-11-30', 'davide.barbieri@example.com', '888999000', 'davide87', 'M', 10),
    ('Giulia', 'Ricci', '1993-08-25', 'giulia.ricci@example.com', '333222111', 'giulia93', 'F', 11),
    ('Andrea', 'Romano', '1982-04-12', 'andrea.romano@example.com', '777888999', 'andrea82', 'M', 12),
    ('Martina', 'Galli', '1997-02-17', 'martina.galli@example.com', '555444333', 'martina97', 'F', 13),
    ('Simone', 'Ferraro', '1991-11-05', 'simone.ferraro@example.com', '666777888', 'simone91', 'M', 10),
    ('Eleonora', 'Fabbri', '1989-06-30', 'eleonora.fabbri@example.com', '999000111', 'eleonora89', 'F', 15);



-- INSERT COMPETENZA 
INSERT INTO competenza (nome, utente_id) VALUES 
    ('Programmazione Java', 1),
    ('Programmazione Java', 1),
    ('Programmazione Python', 1),
    ('Gestione progetti', 2),
    ('Marketing digitale', 3),
    ('Grafica design', 4),
    ('Sviluppo web', 5),
    ('Analisi dati', 6),
    ('Gestione risorse umane', 7),
    ('Architettura software', 8),
    ('Networking', 9),
    ('Copywriting', 10);


-- INSERT AZIENDA 
INSERT INTO Azienda (nome, settore, luogo_id) VALUES
    ('ACME Corporation', 'Tecnologia', 2),
    ('Globex Corporation', 'Servizi',1),
    ('Wayne Enterprises', 'Industria',1),
    ('Stark Industries', 'Innovazione',3),
    ('Umbrella Corporation', 'Biotecnologia',4),
    ('Google', 'Tecnologia', 5),
    ('Apple', 'Tecnologia', 6),
    ('Amazon', 'Servizi', 7),
    ('Tesla', 'Automotive', 8),
    ('Microsoft', 'Tecnologia', 9);

-- INSERT ESPERIENZA_LAVORATIVA 
INSERT INTO Esperienza_Lavorativa ( data_inizio, data_fine, posizione, descrizione) VALUES
    ('2020-01-01', '2021-01-01', 'Sviluppatore Software', 'Sviluppo di applicazioni web'),
    ('2019-05-01', '2020-05-01', 'Analista di Mercato', 'Analisi di dati di mercato e tendenze'),
    ('2018-09-01', '2019-09-01', 'Ingegnere', 'Sviluppo di tecnologie avanzate'),
    ('2017-03-01', '2018-03-01', 'Ingegnere Software', 'Progettazione e sviluppo di software avanzati'),
    ('2016-07-01', '2017-07-01', 'Ricercatore Biomedico', 'Ricerca e sviluppo di nuovi farmaci');

-- INSERT AMICIZIA tra Utenti 
INSERT INTO amicizia (utente_id, amico_id) VALUES
    (2, 1), (2, 3), (2, 4),
    (1,1), (1, 2), (1, 3), (4, 1), (2,9),
    (3,2),(5,4), (6,2), (6,1), (5,2);

-- INSERT INTO Esperienza_Lavorativa_Azienda
INSERT INTO Esperienza_Lavorativa_Azienda (azienda_id, esperienza_Alavorativa_id) 
VALUES (1,1), (2,1), (2,3), (3,1), (1,4), 
       (1,5);

-- INSERT INTO esperienza_lavorativa_utente
INSERT INTO esperienza_lavorativa_utente (esperienza_Ulavorativa_id, utente_id) 
VALUES (1,1),(1,3),(1,2),(1,4),(1,5),(5,3),(5,4),(2,3);
