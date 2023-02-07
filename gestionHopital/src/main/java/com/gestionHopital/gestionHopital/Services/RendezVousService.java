package com.gestionHopital.gestionHopital.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.RendezVous;

@Service
public interface RendezVousService {

    public RendezVous saveRendezVous(RendezVous rendezVous);

    public RendezVous updateRendezVous(RendezVous  rendezVous);

    public String deleteRendezVousById(Long id);

    public String deleteRendezVousByObject(RendezVous rendezVous);

    public List<RendezVous> getAllRendezVous();

    public RendezVous findRendezVousById(Long id) ;

}