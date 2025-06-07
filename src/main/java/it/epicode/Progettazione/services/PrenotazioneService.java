package it.epicode.Progettazione.services;

import it.epicode.Progettazione.Repository.PostazioneRepository;
import it.epicode.Progettazione.Repository.PrenotazioneRepository;
import it.epicode.Progettazione.Repository.UtenteRepository;
import it.epicode.Progettazione.entities.Postazione;
import it.epicode.Progettazione.entities.Prenotazione;
import it.epicode.Progettazione.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired

    private PostazioneRepository postazioneRepository;

    public Prenotazione prenotaPostazione(Long userId, Long postazioneId, LocalDate data) {
        Utente utente = utenteRepository.findById(userId).orElseThrow();
        Postazione postazione = postazioneRepository.findById(postazioneId).orElseThrow();

        if (prenotazioneRepository.existsByUtenteAndDataPrenotazione(utente, data)) {
            throw new RuntimeException("L'utente ha già una prenotazione per questa data.");
        }

        if (prenotazioneRepository.existsByPostazioneAndDataPrenotazione(postazione, data)) {
            throw new RuntimeException("La postazione non è disponibile per questa data.");
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(data);

        return prenotazioneRepository.save(prenotazione);
    }
}
