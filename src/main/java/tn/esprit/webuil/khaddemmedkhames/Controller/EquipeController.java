package tn.esprit.webuil.khaddemmedkhames.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.webuil.khaddemmedkhames.entities.Equipe;
import tn.esprit.webuil.khaddemmedkhames.repository.EquipeRepository;
import tn.esprit.webuil.khaddemmedkhames.services.IEquipeServices;

import java.util.List;

@RestController
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    IEquipeServices equipeServices;
    @GetMapping("")
    public  String hello (){ return  " hello world";}
@PostMapping("/addEquipe")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe equipe){
        equipeServices.addEquipe(equipe);
}

@GetMapping("/Equipelist")
    public List<Equipe> ListEquipe(){
        return equipeServices.retrieveAllEquipes();
}
@Autowired
    EquipeRepository equipeRepository;
@PutMapping("/UpdateEquipe/{idEquipe}")

    public Equipe updateEquipe(@RequestBody Equipe ep,@PathVariable Long idEquipe){
    return this.equipeRepository.findById(idEquipe).map(x->{
        x.setNomEquipe(ep.getNomEquipe());
        x.setNv(ep.getNv());
        return equipeRepository.save(x) ;
    }).orElseGet(()-> {
        ep.setIdEquipe(idEquipe);
        return equipeRepository.save(ep) ;
    }) ;
}

@DeleteMapping("/DeleteEquipe/{idEquipe}")
public void deleteEquipe(@RequestBody Equipe ep,@PathVariable Long idEquipe){
    equipeServices.deleteEquipe(idEquipe);
}


}
