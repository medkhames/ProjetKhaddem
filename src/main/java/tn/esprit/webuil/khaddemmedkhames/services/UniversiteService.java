package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Universite;
import tn.esprit.webuil.khaddemmedkhames.repository.DepartementRepository;
import tn.esprit.webuil.khaddemmedkhames.repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UniversiteService implements IUniversiteService {
    @Autowired
    UniversiteRepository universiteRepository ;
    @Autowired
    DepartementRepository departementRepository;

    @Override
    public long Ajouter_University(Universite u) {
        universiteRepository.save(u);
        log.info("ajouter universite");
        return u.getIdUniversite();
    }
    public Universite updateUniversity(Universite u){
        return universiteRepository.save(u) ;
    }
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();

    }

    @Override
    public void removeUniversite(Long idUniversite) {

    }


    public void removeUniversity(Long idUniversite){
        universiteRepository.deleteById(idUniversite);

    }
    @Override
    public Optional<Universite> findUniversiteById(Long idUniversite) {
        return universiteRepository.findById(idUniversite);
    }
}
