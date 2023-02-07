package com.gestionHopital.gestionHopital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionHopital.gestionHopital.Models.Personne;


@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {
    public Personne findPersonneBynom(String nom);

}
