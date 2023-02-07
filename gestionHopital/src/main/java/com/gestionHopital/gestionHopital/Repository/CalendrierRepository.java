package com.gestionHopital.gestionHopital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionHopital.gestionHopital.Models.Calendrier;

@Repository
public interface CalendrierRepository  extends JpaRepository<Calendrier,Long> {

	
}

