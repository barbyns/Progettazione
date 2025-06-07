package it.epicode.Progettazione.Repository;

import it.epicode.Progettazione.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {}