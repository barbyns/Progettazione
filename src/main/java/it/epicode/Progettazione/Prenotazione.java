package it.epicode.Progettazione;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private Postazione postazione;

    private LocalDate dataPrenotazione;
}
