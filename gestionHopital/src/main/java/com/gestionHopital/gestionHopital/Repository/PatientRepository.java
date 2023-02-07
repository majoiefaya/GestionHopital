package com.gestionHopital.gestionHopital.Repository;

import com.gestionHopital.gestionHopital.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    public Patient findPatientByNom(String nom);

}
