package com.gestionHopital.gestionHopital.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionHopital.gestionHopital.Models.Docteur;
import com.gestionHopital.gestionHopital.Services.DocteurService;

@RestController
@RequestMapping("/Docteur")
@CrossOrigin("*")
public class DocteurController {

    @Autowired
    public DocteurService docteurService;

    @RequestMapping(value="/ajouterDocteur",method= RequestMethod.POST,headers="accept=Application/json")
    public Docteur save(@RequestBody Docteur docteur) {
        try {
            docteur=this.docteurService.saveDocteur(docteur);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return docteur;

    }

    @RequestMapping(value="/getAllDocteurs",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Docteur> getAll() {
        List<Docteur> docteurs=new ArrayList<>();
        try {
            docteurs=this.docteurService.getAllDocteur();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return docteurs;

    }

    @RequestMapping(value="/updateDocteur",method= RequestMethod.PUT,headers="accept=Application/json")
    public Docteur update(@RequestBody Docteur docteur) {
        try {
            docteur=this.docteurService.updateDocteur(docteur);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return docteur;

    }

    @RequestMapping(value = "/deleteDocteur", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Docteur Docteur){
        return this.docteurService.deleteDocteurByObject(Docteur);
    }


    @RequestMapping(value = "/deleteDocteur/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.docteurService.deleteDocteurById(id);
    }



    @RequestMapping(value = "/findDocteurById/{id}", method =RequestMethod.GET)
    public Docteur findById(@PathVariable("id") long id){
        return this.docteurService.findDocteurById(id);
    }



    @RequestMapping(value = "/findDocteurByNomDocteur", method =RequestMethod.GET)
    public Docteur findByNomDocteur(@RequestBody String NomDocteur){
        return this.docteurService.findDocteurBynom(NomDocteur);
    }
}
