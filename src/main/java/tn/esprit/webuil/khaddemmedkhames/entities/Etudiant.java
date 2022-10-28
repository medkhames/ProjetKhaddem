package tn.esprit.webuil.khaddemmedkhames.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;
    @ManyToOne
    Departement departement;

    @OneToMany(cascade = CascadeType.ALL, mappedBy= "etudiant")
    private Set<Contrat> contrats;

    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
}
