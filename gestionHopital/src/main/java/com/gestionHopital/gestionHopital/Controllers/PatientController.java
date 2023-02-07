package com.gestionHopital.gestionHopital.Controllers;

import com.gestionHopital.gestionHopital.Models.Patient;
import com.gestionHopital.gestionHopital.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Patient")
@CrossOrigin("*")
public class PatientController {


    @Autowired
    public PatientService patientService;

    @RequestMapping(value="/ajouterPatient",method= RequestMethod.POST,headers="accept=Application/json")
    public Patient save(@RequestBody Patient patient) {
        try {
            patient=this.patientService.savePatient(patient);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return patient;

    }

    @RequestMapping(value="/getAllPatients",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Patient> getAll() {
        List<Patient> Patients=new ArrayList<>();
        try {
            Patients=this.patientService.getAllPatient();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return Patients;

    }

    @RequestMapping(value="/updatePatient",method= RequestMethod.PUT,headers="accept=Application/json")
    public Patient update(@RequestBody Patient patient) {
        try {
            patient=this.patientService.updatePatient(patient);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return patient;

    }

    @RequestMapping(value = "/deletePatient", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Patient patient){
        return this.patientService.deletePatientByObject(patient);
    }


    @RequestMapping(value = "/deletePatient/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.patientService.deletePatientById(id);
    }



    @RequestMapping(value = "/findPatientById/{id}", method =RequestMethod.GET)
    public Patient findById(@PathVariable("id") long id){
        return this.patientService.findPatientById(id);
    }



    @RequestMapping(value = "/findPatientByNomPatient", method =RequestMethod.GET)
    public Patient findByNomPatient(@RequestBody String NomPatient){
        return this.patientService.findPatientByNom(NomPatient);
    }

}
