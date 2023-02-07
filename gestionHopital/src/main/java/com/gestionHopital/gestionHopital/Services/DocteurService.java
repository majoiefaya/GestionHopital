package com.gestionHopital.gestionHopital.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Docteur;

@Service
public interface DocteurService {


    public Docteur saveDocteur(Docteur docteur);

    public Docteur updateDocteur(Docteur  docteur);

    public String deleteDocteurById(Long id);

    public String deleteDocteurByObject(Docteur docteur);

    public List<Docteur> getAllDocteur();

    public Docteur findDocteurById(Long id) ;

    public Docteur findDocteurBynom(String nom);
}
