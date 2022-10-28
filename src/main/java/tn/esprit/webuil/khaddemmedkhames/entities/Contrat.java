package tn.esprit.webuil.khaddemmedkhames.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat ")
    private long idContrat ; // Clé primaire
    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    private Date dateFinContrat;

    @Enumerated(EnumType.STRING)
    private specialite Specialite;
    private long montantContrat ;

    @ManyToOne
    Etudiant etudiant;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
