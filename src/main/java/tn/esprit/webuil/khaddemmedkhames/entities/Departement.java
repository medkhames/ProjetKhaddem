package tn.esprit.webuil.khaddemmedkhames.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    private Long idDepartement; // Clé primaire

    private String nomDepartement;
    @OneToMany(cascade = CascadeType.ALL, mappedBy= "departement")
    private List<Etudiant> etudiants;

}