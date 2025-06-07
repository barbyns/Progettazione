package it.epicode.Progettazione.Repository;

import it.epicode.Progettazione.entities.Postazione;
import it.epicode.Progettazione.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Città(TipoPostazione tipo, String città);
}
