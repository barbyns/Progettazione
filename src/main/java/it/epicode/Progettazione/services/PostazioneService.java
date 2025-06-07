package it.epicode.Progettazione.services;

import it.epicode.Progettazione.Repository.PostazioneRepository;
import it.epicode.Progettazione.entities.Postazione;
import it.epicode.Progettazione.entities.TipoPostazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepo;

    public List<Postazione> cerca(TipoPostazione tipo, String città) {
        return postazioneRepo.findByTipoAndEdificio_Città(tipo, città);
    }
}