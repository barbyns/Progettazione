package it.epicode.Progettazione.Repository;

import it.epicode.Progettazione.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {}
