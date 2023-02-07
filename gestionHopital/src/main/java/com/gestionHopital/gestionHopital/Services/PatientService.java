package com.gestionHopital.gestionHopital.Services;

import com.gestionHopital.gestionHopital.Models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    public Patient savePatient(Patient Patient);

    public Patient updatePatient(Patient  Patient);

    public String deletePatientById(Long id);

    public String deletePatientByObject(Patient Patient);

    public List<Patient> getAllPatient();

    public Patient findPatientById(Long id) ;

    public Patient findPatientByNom(String nom);

}
