package tn.esprit.webuil.khaddemmedkhames.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.webuil.khaddemmedkhames.entities.Equipe;
import tn.esprit.webuil.khaddemmedkhames.repository.EquipeRepository;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
@Service
@Slf4j
public class EquipeServices implements IEquipeServices{

    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();

    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);

    }

    @Override
    public Equipe updateEquipe(Equipe e) {

        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe.longValue()).get();
    }

    @Override
    public void deleteEquipe(Long idEquipe) {
        equipeRepository.deleteById(idEquipe);

    }
}
