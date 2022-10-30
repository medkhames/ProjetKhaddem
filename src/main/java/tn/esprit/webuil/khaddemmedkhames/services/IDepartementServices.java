package tn.esprit.webuil.khaddemmedkhames.services;

import tn.esprit.webuil.khaddemmedkhames.entities.Departement;

import java.util.List;

public interface IDepartementServices {

    List<Departement> retrieveAllDepartement();

    Departement addDepartement(Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepartement);

    void deleteDepartement(Long idDepartement);
}
