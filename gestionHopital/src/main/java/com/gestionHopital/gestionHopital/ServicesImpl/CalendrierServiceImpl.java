package com.gestionHopital.gestionHopital.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Calendrier;
import com.gestionHopital.gestionHopital.Repository.CalendrierRepository;
import com.gestionHopital.gestionHopital.Services.CalendrierService;

@Service
public class CalendrierServiceImpl implements CalendrierService{

    @Autowired
    public CalendrierRepository calendrierRepository;

    @Override
    public Calendrier saveCalendrier(Calendrier calendrier) {
        return this.calendrierRepository.save(calendrier);
    }

    @Override
    public Calendrier updateCalendrier(Calendrier calendrier) {
        return this.calendrierRepository.save(calendrier);
    }

    @Override
    public String deleteCalendrierById(Long id) {
        this.calendrierRepository.deleteById(id);
        return  "Calendrier Supprimé avec succes !";
    }

    @Override
    public String deleteCalendrierByObject(Calendrier calendrier) {
        this.calendrierRepository.deleteById(calendrier.getId());
        return "Calendrier Supprimé avec succes !";
    }

    @Override
    public List<Calendrier> getAllCalendrier() {
        return this.calendrierRepository.findAll();
    }

    @Override
    public Calendrier findCalendrierById(Long id) {
        return this.calendrierRepository.findById(id).orElse(null);
    }

   
}
