package com.gestionHopital.gestionHopital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionHopital.gestionHopital.Models.RendezVous;


@Repository
public interface RendezVousRepository  extends JpaRepository<RendezVous,Long> {


}
