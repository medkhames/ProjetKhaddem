package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Departement;
import tn.esprit.webuil.khaddemmedkhames.repository.DepartementRepository;

import java.util.List;

@Service
@Slf4j
public class DepartementServices implements IDepartementServices{

    @Autowired
    DepartementRepository departementRepository;


    @Override
    public List<Departement> retrieveAllDepartement() {
        return departementRepository.findAll();

    }

    @Override
    public Departement addDepartement(Departement c) {
        return departementRepository.save(c);

    }

    @Override
    public Departement updateDepartement(Departement c) {

        return departementRepository.save(c);
    }



    @Override
    public Departement retrieveDepartement(Integer idDepartement) {
        return null;
    }


    @Override
    public void deleteDepartement(Long idDepartement) {
        departementRepository.deleteById(idDepartement);

    }
}
