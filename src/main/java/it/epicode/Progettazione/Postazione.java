package it.epicode.Progettazione;

import jakarta.persistence.*;

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codiceUnivoco;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    private int maxOccupanti;

    @ManyToOne
    private Edificio edificio;
}
