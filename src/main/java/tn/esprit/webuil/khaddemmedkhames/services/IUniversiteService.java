package tn.esprit.webuil.khaddemmedkhames.services;

import tn.esprit.webuil.khaddemmedkhames.entities.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {
    public long Ajouter_University(Universite u) ;
    public Universite updateUniversity(Universite u) ;
    public List<Universite> retrieveAllUniversite() ;
    public void removeUniversite(Long idUniversite) ;
    public Optional<Universite> findUniversiteById(Long idUniversite);
}
