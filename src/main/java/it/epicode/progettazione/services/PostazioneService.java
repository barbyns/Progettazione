package it.epicode.progettazione.services;

import it.epicode.progettazione.Repository.PostazioneRepository;
import it.epicode.progettazione.entities.Postazione;
import it.epicode.progettazione.entities.TipoPostazione;
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