package tn.esprit.webuil.khaddemmedkhames.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table( name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Long idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau nv;

    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany(mappedBy = "equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}