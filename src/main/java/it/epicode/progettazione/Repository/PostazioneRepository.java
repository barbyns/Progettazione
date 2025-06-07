package it.epicode.progettazione.Repository;

import it.epicode.progettazione.entities.Postazione;
import it.epicode.progettazione.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Città(TipoPostazione tipo, String città);
}
