package tn.esprit.webuil.khaddemmedkhames.services;

import tn.esprit.webuil.khaddemmedkhames.entities.Contrat;


import java.util.List;

public interface IContratServices {

    List<Contrat> retrieveAllContrat();

    Contrat addContrat(Contrat c);


    Contrat updateContrat(Contrat c);

    Contrat retrieveContrat (Integer idContrat);

    void deleteContrat(Long idContrat);
}
