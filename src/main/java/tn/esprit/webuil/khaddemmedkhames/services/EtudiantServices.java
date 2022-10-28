package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Etudiant;
import tn.esprit.webuil.khaddemmedkhames.repository.EtudiantRepository;

import java.util.List;


@Service
@Slf4j
public class EtudiantServices implements IEtudiantServices {

    @Autowired
    EtudiantRepository etudiantRepository;
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantRepository.findAll();

    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant.longValue()).get();
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
