package it.epicode.progettazione;

import it.epicode.progettazione.Repository.EdificioRepository;
import it.epicode.progettazione.Repository.PostazioneRepository;
import it.epicode.progettazione.Repository.UtenteRepository;
import it.epicode.progettazione.entities.Edificio;
import it.epicode.progettazione.entities.Postazione;
import it.epicode.progettazione.entities.TipoPostazione;
import it.epicode.progettazione.entities.Utente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



import java.time.LocalDate;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionePrenotazioniApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionePrenotazioniApplication.class, args);
    }
}
