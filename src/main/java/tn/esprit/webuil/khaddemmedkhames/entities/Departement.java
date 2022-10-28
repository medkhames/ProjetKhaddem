package tn.esprit.webuil.khaddemmedkhames.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    private Long idDepartement; // Clé primaire

    private String nomDepartement;
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "departement")
    private Set<Etudiant> etudiants;

}