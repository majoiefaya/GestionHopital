package com.gestionHopital.gestionHopital.ServicesImpl;

import com.gestionHopital.gestionHopital.Models.Patient;
import com.gestionHopital.gestionHopital.Repository.PatientRepository;
import com.gestionHopital.gestionHopital.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    @Autowired
    public PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public String deletePatientById(Long id) {
        this.patientRepository.deleteById(id);
        return  "Patient Supprimé avec succes !";
    }

    @Override
    public String deletePatientByObject(Patient patient) {
        this.patientRepository.deleteById(patient.getId());
        return "Patient Supprimé avec succes !";
    }

    @Override
    public List<Patient> getAllPatient() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient findPatientById(Long id) {
        return this.patientRepository.findById(id).orElse(null);
    }

    @Override
    public Patient findPatientByNom(String nom) {
        return this.patientRepository.findPatientByNom(nom);
    }
}
