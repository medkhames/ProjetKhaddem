package tn.esprit.webuil.khaddemmedkhames.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.webuil.khaddemmedkhames.entities.Etudiant;
import tn.esprit.webuil.khaddemmedkhames.repository.EtudiantRepository;
import tn.esprit.webuil.khaddemmedkhames.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {

    @PostMapping ("/affecter-etudiant-departement/{idEtudiant}/{idDepartement}")
    public void assignEtudiantToDepartment(@PathVariable("idEtudiant")Long idEtudiant ,
                                           @PathVariable("idDepartement")Long idDepartement)
    {
        etudiantServices.assignEtudiantToDepartment(idEtudiant,idDepartement);
    }
    @Autowired
    IEtudiantServices etudiantServices;
    @GetMapping("")
    public  String hello (){
        return  " hello khaddem";
    }
    @PostMapping("/addEtudiant")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant){
        etudiantServices.addEtudiant(etudiant);
    }

    @GetMapping("/Etudiantlist")
    public List<Etudiant> ListEtudiant(){
        return etudiantServices.retrieveAllEtudiant();
    }


    @Autowired
    EtudiantRepository etudiantRepository;

    @PutMapping("/UpdateEtudiant/{idEtudiant}")

    public Etudiant updateEtudiant(@RequestBody Etudiant e,@PathVariable Long idEtudiant){
        return this.etudiantRepository.findById(idEtudiant).map(y->{

          y.setPrenomE(e.getPrenomE());
          y.setNomE(e.getNomE());
          y.setOp(e.getOp());
            return etudiantRepository.save(y) ;
        }).orElseGet(()-> {
            e.setIdEtudiant(idEtudiant);
            return etudiantRepository.save(e) ;
        }) ;
    }

    @DeleteMapping("/DeleteEtudiant/{idEtudiant}")
    public void deleteEtudiant(@RequestBody Etudiant e, @PathVariable Long idEtudiant){
        etudiantServices.deleteEtudiant(idEtudiant);
    }



}
