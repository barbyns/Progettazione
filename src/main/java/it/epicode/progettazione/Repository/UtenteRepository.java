package it.epicode.progettazione.Repository;

import it.epicode.progettazione.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {}
