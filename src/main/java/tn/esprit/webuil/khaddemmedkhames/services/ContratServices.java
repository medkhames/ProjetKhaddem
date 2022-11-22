package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Contrat;
import tn.esprit.webuil.khaddemmedkhames.repository.ContratRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ContratServices implements IContratServices {
    @Autowired
    ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrat() {
        return contratRepository.findAll();

    }

@Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);

    }

@Override
    public Contrat updateContrat(Contrat c) {

        return contratRepository.save(c);
    }



    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return null;
    }
    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }

    @Override
    public Optional<Contrat> findContratById(Long idContrat) {
        return contratRepository.findById(idContrat);
    }

}
