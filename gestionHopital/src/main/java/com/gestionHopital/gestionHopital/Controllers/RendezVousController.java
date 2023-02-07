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

import com.gestionHopital.gestionHopital.Models.RendezVous;
import com.gestionHopital.gestionHopital.Services.RendezVousService;

@RestController
@RequestMapping("/RendezVous")
@CrossOrigin("*")
public class RendezVousController {

    @Autowired
    public RendezVousService rendezVousService;

    @RequestMapping(value="/ajouterRendezVous",method= RequestMethod.POST,headers="accept=Application/json")
    public RendezVous save(@RequestBody RendezVous rendezVous) {
        try {
            rendezVous=this.rendezVousService.saveRendezVous(rendezVous);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rendezVous;

    }

    @RequestMapping(value="/getAllRendezVouss",method= RequestMethod.GET,headers="accept=Application/json")
    public List<RendezVous> getAll() {
        List<RendezVous> rendezVouss=new ArrayList<>();
        try {
            rendezVouss=this.rendezVousService.getAllRendezVous();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rendezVouss;

    }

    @RequestMapping(value="/updateRendezVous",method= RequestMethod.PUT,headers="accept=Application/json")
    public RendezVous update(@RequestBody RendezVous rendezVous) {
        try {
            rendezVous=this.rendezVousService.updateRendezVous(rendezVous);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rendezVous;

    }

    @RequestMapping(value = "/deleteRendezVous", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody RendezVous rendezVous){
        return this.rendezVousService.deleteRendezVousByObject(rendezVous);
    }


    @RequestMapping(value = "/deleteRendezVous/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.rendezVousService.deleteRendezVousById(id);
    }



    @RequestMapping(value = "/findRendezVousById/{id}", method =RequestMethod.GET)
    public RendezVous findById(@PathVariable("id") long id){
        return this.rendezVousService.findRendezVousById(id);
    }


}
