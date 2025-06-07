package it.epicode.progettazione.Repository;

import it.epicode.progettazione.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {}