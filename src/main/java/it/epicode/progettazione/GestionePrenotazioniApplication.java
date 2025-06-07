package it.epicode.progettazione;

import it.epicode.progettazione.entities.*;
import it.epicode.progettazione.repository.EdificioRepository;
import it.epicode.progettazione.repository.PostazioneRepository;
import it.epicode.progettazione.repository.UtenteRepository;
import it.epicode.progettazione.repository.PrenotazioneRepository;

import it.epicode.progettazione.services.PrenotazioneService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class GestionePrenotazioniApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionePrenotazioniApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(
            EdificioRepository edificioRepo,
            PostazioneRepository postazioneRepo,
            UtenteRepository utenteRepo,
            PrenotazioneService prenotazioneService) {

        return args -> {
            // Crea un edificio
            Edificio edificio = new Edificio();
            edificio.setNome("Palazzo Epicode");
            edificio.setIndirizzo("Via Java 17");
            edificio.setCitta("Milano");
            edificioRepo.save(edificio);

            // Crea una postazione
            Postazione postazione = new Postazione();
            postazione.setDescrizione("Open Space 1° piano");
            postazione.setTipo(TipoPostazione.OPENSPACE);
            postazione.setNumeroMassimoOccupanti(6);
            postazione.setEdificio(edificio);
            postazioneRepo.save(postazione);

            // Crea un utente
            Utente utente = new Utente();
            utente.setUsername("alice");
            utente.setNomeCompleto("Alice Rossi");
            utente.setEmail("alice@epicode.it");
            utenteRepo.save(utente);

            // Data della prenotazione
            LocalDate data = LocalDate.now().plusDays(1);

            // Prova a prenotare
            Long Utente = 0L;
            Prenotazione success = prenotazioneService.prenotaPostazione(Utente, postazione, data);

            // Output
            if (success) {
                System.out.println(" Prenotazione effettuata con successo.");
            } else {
                System.out.println(" Prenotazione fallita: la postazione è occupata o l'utente ha già una prenotazione.");
            }
        };
    }
}
