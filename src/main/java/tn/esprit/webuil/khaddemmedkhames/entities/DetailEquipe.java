package tn.esprit.webuil.khaddemmedkhames.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Long idDetailEquipe; // Clé primaire
    private long salle;
    private String thematique;

    @OneToOne (mappedBy = "detailEquipe")
    private Equipe equipes;
}