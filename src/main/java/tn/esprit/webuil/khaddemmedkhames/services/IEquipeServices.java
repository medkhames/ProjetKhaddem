package tn.esprit.webuil.khaddemmedkhames.services;

import tn.esprit.webuil.khaddemmedkhames.entities.Equipe;

import java.util.List;

public interface IEquipeServices {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

    void deleteEquipe(Long idEquipe);
}
