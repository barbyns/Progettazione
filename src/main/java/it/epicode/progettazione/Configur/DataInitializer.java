package it.epicode.progettazione.Configur;

import it.epicode.progettazione.repository.EdificioRepository;
import it.epicode.progettazione.repository.PostazioneRepository;
import it.epicode.progettazione.repository.UtenteRepository;
import it.epicode.progettazione.entities.Edificio;
import it.epicode.progettazione.entities.Postazione;
import it.epicode.progettazione.entities.TipoPostazione;
import it.epicode.progettazione.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EdificioRepository edificioRepo;

    @Autowired
    private UtenteRepository utenteRepo;

    @Autowired
    private PostazioneRepository postazioneRepo;

    @Override
    public void run(String... args) {
        // Edifici
        Edificio edificio1 = new Edificio(null, "Edificio Alpha", "Via Roma 1", "Milano");
        Edificio edificio2 = new Edificio(null, "Edificio Beta", "Via Verdi 2", "Roma");

        edificioRepo.saveAll(List.of(edificio1, edificio2));

        // Utenti
        Utente utente1 = new Utente(null, "lucarossi", "Luca Rossi", "luca@example.com");
        Utente utente2 = new Utente(null, "mariobianchi", "Mario Bianchi", "mario@example.com");

        utenteRepo.saveAll(List.of(utente1, utente2));

        // Postazioni
        Postazione p1 = new Postazione(null, "P001", "Postazione privata in open space", TipoPostazione.PRIVATO, 1, edificio1);
        Postazione p2 = new Postazione(null, "P002", "Sala riunioni da 4 posti", TipoPostazione.SALA_RIUNIONI, 4, edificio1);
        Postazione p3 = new Postazione(null, "P003", "Open space con 6 posti", TipoPostazione.OPENSPACE, 6, edificio2);

        postazioneRepo.saveAll(List.of(p1, p2, p3));

        System.out.println(" Dati inizializzati.");
    }
}
