package com.gestionHopital.gestionHopital.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Personne;
import com.gestionHopital.gestionHopital.Repository.PersonneRepository;
import com.gestionHopital.gestionHopital.Services.PersonneService;

@Service
public class PersonneServiceImpl implements PersonneService{

    @Autowired
    public PersonneRepository personneRepository;

    @Override
    public Personne savePersonne(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public String deletePersonneById(Long id) {
        this.personneRepository.deleteById(id);
        return  "Personne Supprimé avec succes !";
    }

    @Override
    public String deletePersonneByObject(Personne personne) {
        this.personneRepository.deleteById(personne.getId());
        return "Personne Supprimé avec succes !";
    }

    @Override
    public List<Personne> getAllPersonne() {
        return this.personneRepository.findAll();
    }

    @Override
    public Personne findPersonneById(Long id) {
        return this.personneRepository.findById(id).orElse(null);
    }

	@Override
	public Personne findPersonneBynom(String nom) {
		 return this.personneRepository.findPersonneBynom(nom);
	}

}
