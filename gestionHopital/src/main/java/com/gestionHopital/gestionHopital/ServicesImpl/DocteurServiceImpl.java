package com.gestionHopital.gestionHopital.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Docteur;
import com.gestionHopital.gestionHopital.Repository.DocteurRepository;
import com.gestionHopital.gestionHopital.Services.DocteurService;

@Service
public class DocteurServiceImpl implements DocteurService{


    @Autowired
    public DocteurRepository docteurRepository;

    @Override
    public Docteur saveDocteur(Docteur Docteur) {
        return this.docteurRepository.save(Docteur);
    }

    @Override
    public Docteur updateDocteur(Docteur Docteur) {
        return this.docteurRepository.save(Docteur);
    }

    @Override
    public String deleteDocteurById(Long id) {
        this.docteurRepository.deleteById(id);
        return  "Docteur Supprimé avec succes !";
    }

    @Override
    public String deleteDocteurByObject(Docteur Docteur) {
        this.docteurRepository.deleteById(Docteur.getId());
        return "Docteur Supprimé avec succes !";
    }

    @Override
    public List<Docteur> getAllDocteur() {
        return this.docteurRepository.findAll();
    }

    @Override
    public Docteur findDocteurById(Long id) {
        return this.docteurRepository.findById(id).orElse(null);
    }

	@Override
	public Docteur findDocteurBynom(String nom) {
		  return this.docteurRepository.findDocteurBynom(nom);
	}

}
