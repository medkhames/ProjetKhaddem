package tn.esprit.webuil.khaddemmedkhames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.webuil.khaddemmedkhames.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByDepartementIdDepartement(Long idDepartement);
}
