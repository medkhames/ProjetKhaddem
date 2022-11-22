package tn.esprit.webuil.khaddemmedkhames.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.webuil.khaddemmedkhames.entities.Universite;
import tn.esprit.webuil.khaddemmedkhames.services.IUniversiteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Universite")
public class UniversiteController {

    @Autowired
    IUniversiteService universiteService;

    @PostMapping("/addUniversity")
    @ResponseBody
    public void addUniversity(@RequestBody Universite universite){

        universiteService.Ajouter_University(universite) ;
    }


    @GetMapping("/university")
    public List<Universite> FindALL() {
        return this.universiteService.retrieveAllUniversite();

    }
    @PutMapping("/updateuniversity")
    public Universite UpdateUniversite(@RequestBody Universite u){
        Universite university=universiteService.updateUniversity(u);
        return university ;
    }



    @DeleteMapping ("/removeUniversity/{idUniv}")
    @ResponseBody
    public void removeUniversite(@PathVariable("idUniversite") Long idUniversite) {
        universiteService.removeUniversite(idUniversite);

    }
    @GetMapping("/findbyIdUniversity/{idUniv}")
    @ResponseBody
    public Optional<Universite> GetUniversitybyId(@PathVariable("idUniversite") Long idUniversite){
        return universiteService.findUniversiteById(idUniversite);
    }
}
