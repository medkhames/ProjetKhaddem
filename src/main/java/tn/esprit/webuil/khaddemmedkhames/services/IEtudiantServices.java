package tn.esprit.webuil.khaddemmedkhames.services;

import tn.esprit.webuil.khaddemmedkhames.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant (Integer idEtudiant);

    void deleteEtudiant(Long idEtudiant);

    public void assignEtudiantToDepartement(Long idEtudiant, Long idDepartement);


    Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Long idContrat , Long idEquipe);
}
