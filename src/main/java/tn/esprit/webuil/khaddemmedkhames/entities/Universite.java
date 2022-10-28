package tn.esprit.webuil.khaddemmedkhames.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUnivt; // Clé primaire

    private String nomUniv;
@OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departement;
}