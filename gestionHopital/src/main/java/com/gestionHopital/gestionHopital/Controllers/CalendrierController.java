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

import com.gestionHopital.gestionHopital.Models.Calendrier;
import com.gestionHopital.gestionHopital.Services.CalendrierService;

@RestController
@RequestMapping("/Calendrier")
@CrossOrigin("*")
public class CalendrierController {

	@Autowired
    public CalendrierService calendrierService;

    @RequestMapping(value="/ajouterCalendrier",method= RequestMethod.POST,headers="accept=Application/json")
    public Calendrier save(@RequestBody Calendrier calendrier) {
        try {
            calendrier=this.calendrierService.saveCalendrier(calendrier);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return calendrier;

    }

    @RequestMapping(value="/getAllCalendriers",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Calendrier> getAll() {
        List<Calendrier> calendriers=new ArrayList<>();
        try {
            calendriers=this.calendrierService.getAllCalendrier();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return calendriers;

    }

    @RequestMapping(value="/updateCalendrier",method= RequestMethod.PUT,headers="accept=Application/json")
    public Calendrier update(@RequestBody Calendrier calendrier) {
        try {
            calendrier=this.calendrierService.updateCalendrier(calendrier);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return calendrier;

    }

    @RequestMapping(value = "/deleteCalendrier", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Calendrier calendrier){
        return this.calendrierService.deleteCalendrierByObject(calendrier);
    }


    @RequestMapping(value = "/deleteCalendrier/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.calendrierService.deleteCalendrierById(id);
    }



    @RequestMapping(value = "/findCalendrierById/{id}", method =RequestMethod.GET)
    public Calendrier findById(@PathVariable("id") long id){
        return this.calendrierService.findCalendrierById(id);
    }

}
