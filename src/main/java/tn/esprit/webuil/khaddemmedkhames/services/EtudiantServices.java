package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Contrat;
import tn.esprit.webuil.khaddemmedkhames.entities.Departement;
import tn.esprit.webuil.khaddemmedkhames.entities.Equipe;
import tn.esprit.webuil.khaddemmedkhames.entities.Etudiant;
import tn.esprit.webuil.khaddemmedkhames.repository.ContratRepository;
import tn.esprit.webuil.khaddemmedkhames.repository.DepartementRepository;
import tn.esprit.webuil.khaddemmedkhames.repository.EquipeRepository;
import tn.esprit.webuil.khaddemmedkhames.repository.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Slf4j
public class EtudiantServices implements IEtudiantServices {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    ContratRepository contratRepository;
    @Autowired
    EquipeRepository equipeRepository;
    @Autowired
    DepartementRepository departementRepository;
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





    @Transactional
    public void assignEtudiantToDepartement(Long idEtudiant, Long idDepartement) {
        Etudiant e = etudiantRepository.findById(idEtudiant).get();
        Departement d =  departementRepository.findById(idDepartement).get();
        e.setDepartement(d);

    }
@Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Long idContrat , Long idEquipe){
    Etudiant etudiant = etudiantRepository.save(e);
    Contrat c = contratRepository.findById(idContrat).orElse(null);
        Equipe eq = equipeRepository.findById(idEquipe).orElse(null);

        c.setEtudiant(e);
        eq.getEtudiants().add(e);
        return e;
    }




}
