package tn.esprit.webuil.khaddemmedkhames.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.webuil.khaddemmedkhames.entities.Contrat;
import tn.esprit.webuil.khaddemmedkhames.repository.ContratRepository;
import tn.esprit.webuil.khaddemmedkhames.services.IContratServices;

import java.util.List;

@RestController
@RequestMapping("/Contrat")
public class ContratController {

    @Autowired
    IContratServices contratServices;
    @GetMapping("")
    public String hello(){ return "hello world";}

    @PostMapping("/addContrat")
    @ResponseBody
    public void addContrat(@RequestBody Contrat contrat){contratServices.addContrat(contrat);}

    @GetMapping("/Contratlist")
    public List<Contrat> ListContrats(){return  contratServices.retrieveAllContrat();}

    @Autowired
    ContratRepository contratRepository;
     @PutMapping("/UpdateContrat/{idContrat}")
    public Contrat updateContrat(@RequestBody Contrat ct,@PathVariable Long idContrat){
         return this.contratRepository.findById(idContrat).map(x->{
             x.setMontantContrat(ct.getMontantContrat());
             x.setDateDebutContrat(ct.getDateDebutContrat());
             x.setDateFinContrat(ct.getDateFinContrat());
             x.setSpecialite(ct.getSpecialite());
             return  contratRepository.save(x);
         }).orElseGet(()->{
             ct.setIdContrat(idContrat);
             return contratRepository.save(ct);
         });
     }


     @DeleteMapping("/DeleteContrat/{idContrat}")
    public void deleteContrat(@RequestBody Contrat ct,@PathVariable Long idContrat){
         contratServices.deleteContrat(idContrat);
     }
}
