
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
INSERT INTO competenza (nome) VALUES 
    ('Programmazione Java'),
    ('Programmazione Python'),
    ('Gestione progetti'),
    ('Marketing digitale'),
    ('Grafica design'),
    ('Sviluppo web'),
    ('Analisi dati'),
    ('Gestione risorse umane'),
    ('Architettura software'),
    ('Networking'),
    ('Copywriting');



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
INSERT INTO esperienza_lavorativa ( data_inizio, data_fine, posizione, descrizione, azienda_id, utente_id) VALUES
    ('2020-01-01', '2021-01-01', 'Sviluppatore Software', 'Sviluppo di applicazioni web',1,2),
    ('2019-05-01', '2020-05-01', 'Analista di Mercato', 'Analisi di dati di mercato e tendenze',2,2),
    ('2018-09-01', '2019-09-01', 'Ingegnere', 'Sviluppo di tecnologie avanzate',3,4),
    ('2017-03-01', '2018-03-01', 'Ingegnere Software', 'Progettazione e sviluppo di software avanzati',4,12),
    ('2016-07-01', '2017-07-01', 'Ricercatore Biomedico', 'Ricerca e sviluppo di nuovi farmaci',2,5),
    ('2015-01-01', '2016-01-01', 'Project Manager', 'Gestione di progetti complessi', 5, 7),
    ('2014-06-01', '2015-06-01', 'Analista Finanziario', 'Analisi dei mercati finanziari', 6, 8),
    ('2013-10-01', '2014-10-01', 'Sviluppatore Mobile', 'Sviluppo di applicazioni per dispositivi mobili', 7, 3),
    ('2012-04-01', '2013-04-01', 'Marketing Manager', 'Pianificazione e gestione delle strategie di marketing', 8, 9),
    ('2011-08-01', '2012-08-01', 'Consulente Tecnico', 'Consulenza su soluzioni tecnologiche', 9, 6),
    ('2010-12-01', '2011-12-01', 'Ingegnere Elettronico', 'Progettazione di circuiti elettronici', 10, 4),
    ('2009-03-01', '2010-03-01', 'Specialista SEO', 'Ottimizzazione dei motori di ricerca', 2, 1),
    ('2008-07-01', '2009-07-01', 'Analista di Dati', 'Analisi statistica e interpretazione dei dati', 1, 10),
    ('2007-11-01', '2008-11-01', 'Ingegnere delle Telecomunicazioni', 'Sviluppo di reti di telecomunicazioni', 4, 11),
    ('2006-05-01', '2007-05-01', 'Analista di Sistemi', 'Analisi e progettazione di sistemi informatici', 5, 2);
-- INSERT AMICIZIA tra Utenti 
INSERT INTO amicizia (utente_id, amico_id) VALUES
        (9, 1), (1, 2), (1, 3), (1,4), (2, 3), (3, 2), (4, 2), (5,3),
        (6, 3), (6, 9);

