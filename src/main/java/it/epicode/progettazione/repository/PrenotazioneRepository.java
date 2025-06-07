package it.epicode.progettazione.repository;

import it.epicode.progettazione.entities.Postazione;
import it.epicode.progettazione.entities.Prenotazione;
import it.epicode.progettazione.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}
