package tn.esprit.webuil.khaddemmedkhames.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.webuil.khaddemmedkhames.entities.Departement;
import tn.esprit.webuil.khaddemmedkhames.repository.DepartementRepository;
import tn.esprit.webuil.khaddemmedkhames.services.IDepartementServices;

import java.util.List;

@RestController
@RequestMapping("/Departement")
public class DepartementController {
    @Autowired
    IDepartementServices departementServices;
    @GetMapping("")
    public  String hello (){ return  " hello khames";}


    @PostMapping("/addDepartement")
    @ResponseBody
    public void addDepartement(@RequestBody Departement departement){departementServices.addDepartement(departement);}

    @GetMapping("/Departementlist")
    public List<Departement> ListDepartement(){
        return departementServices.retrieveAllDepartement();
    }

    @Autowired
    DepartementRepository departementRepository;
    @PutMapping("/updateDepartement{idDepartement}")
    public Departement updateDepartement(@RequestBody Departement dp,@PathVariable Long idDepartement){
        return  this.departementRepository.findById(idDepartement).map(x->{
            x.setNomDepartement(dp.getNomDepartement());
            return departementRepository.save(x);
        }).orElseGet(()->{
            dp.setIdDepartement(idDepartement);
            return departementRepository.save(dp);
        });
    }

    @DeleteMapping("/DeleteDepartement/{idDepartement}")
    public  void deleteDepartement(@RequestBody Departement dp,@PathVariable Long idDepartement ){
        departementServices.deleteDepartement(idDepartement);
    }
}
