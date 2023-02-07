package com.gestionHopital.gestionHopital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionHopital.gestionHopital.Models.Docteur;

@Repository
public interface DocteurRepository extends JpaRepository<Docteur,Long> {
    public Docteur findDocteurBynom(String nom);

}
