package com.gestionHopital.gestionHopital.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.RendezVous;
import com.gestionHopital.gestionHopital.Repository.RendezVousRepository;
import com.gestionHopital.gestionHopital.Services.RendezVousService;

@Service
public class RendezVousServiceImpl implements RendezVousService{

    @Autowired
    public RendezVousRepository rendezVousRepository;

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return this.rendezVousRepository.save(rendezVous);
    }

    @Override
    public RendezVous updateRendezVous(RendezVous rendezVous) {
        return this.rendezVousRepository.save(rendezVous);
    }

    @Override
    public String deleteRendezVousById(Long id) {
        this.rendezVousRepository.deleteById(id);
        return  "RendezVous Supprimé avec succes !";
    }

    @Override
    public String deleteRendezVousByObject(RendezVous rendezVous) {
        this.rendezVousRepository.deleteById(rendezVous.getId());
        return "RendezVous Supprimé avec succes !";
    }

    @Override
    public List<RendezVous> getAllRendezVous() {
        return this.rendezVousRepository.findAll();
    }

    @Override
    public RendezVous findRendezVousById(Long id) {
        return this.rendezVousRepository.findById(id).orElse(null);
    }

}
