package com.gestionHopital.gestionHopital.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestionHopital.gestionHopital.Models.Calendrier;

@Service
public interface CalendrierService {

    public Calendrier saveCalendrier(Calendrier calendrier);

    public Calendrier updateCalendrier(Calendrier  calendrier);

    public String deleteCalendrierById(Long id);

    public String deleteCalendrierByObject(Calendrier calendrier);

    public List<Calendrier> getAllCalendrier();

    public Calendrier findCalendrierById(Long id) ;

}
