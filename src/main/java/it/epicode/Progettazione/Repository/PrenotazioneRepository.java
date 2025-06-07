package it.epicode.Progettazione.Repository;

import it.epicode.Progettazione.entities.Postazione;
import it.epicode.Progettazione.entities.Prenotazione;
import it.epicode.Progettazione.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}
