package it.epicode.progettazione;


import it.epicode.progettazione.entities.*;
import it.epicode.progettazione.services.PrenotazioneService;
import it.epicode.progettazione.repository.PostazioneRepository;
import it.epicode.progettazione.repository.UtenteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProgettazioneApplicationTests {

	@Autowired
	private PrenotazioneService prenotazioneService;

	@Autowired
	private UtenteRepository utenteRepository;

	@Autowired
	private PostazioneRepository postazioneRepository;

	@Test
	public void testPrenotazioneValida() {
		Utente utente = utenteRepository.save(new Utente("mrossi", "Mario Rossi", "mario@example.com"));
		Edificio edificio = new Edificio("Sede Centrale", "Via Roma 1", "Milano");
		Postazione postazione = new Postazione("P001", "Postazione Privata", TipoPostazione.PRIVATO, 1, edificio);
		postazione = postazioneRepository.save(postazione);

		Prenotazione p = prenotazioneService.prenota(utente.getId(), postazione.getId(), LocalDate.now());
		assertNotNull(p);
	}
