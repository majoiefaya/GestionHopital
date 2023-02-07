package com.gestionHopital.gestionHopital.Models;

import jakarta.persistence.*;


@Entity
@Table(name="RendezVous")
public class RendezVous {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="statut",nullable = false)
    private Boolean statut;

    @Column(name="motif",nullable = true)
    private String motif;
    
    @ManyToOne()
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    @ManyToOne()
    @JoinColumn(name = "docteur_id")
    private Docteur docteur;
    
    @ManyToOne()
    @JoinColumn(name = "calendrier_id")
    private Calendrier calendrier;

	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RendezVous(Long id, Boolean statut, String motif, Patient patient, Docteur docteur, Calendrier calendrier) {
		super();
		this.id = id;
		this.statut = statut;
		this.motif = motif;
		this.patient = patient;
		this.docteur = docteur;
		this.calendrier = calendrier;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Docteur getDocteur() {
		return docteur;
	}

	public void setDocteur(Docteur docteur) {
		this.docteur = docteur;
	}

	public Calendrier getCalendrier() {
		return calendrier;
	}

	public void setCalendrier(Calendrier calendrier) {
		this.calendrier = calendrier;
	}

	@Override
	public String toString() {
		return "RendezVous [id=" + id + ", statut=" + statut + ", motif=" + motif + ", patient=" + patient
				+ ", docteur=" + docteur + ", calendrier=" + calendrier + "]";
	}

    
}
