package com.gestionHopital.gestionHopital.Models;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Docteur")
@DiscriminatorColumn(name="DocteurType")
public class Docteur extends Personne{

	 @Column(name="specialite",nullable = false)
	 private String specialite;
	 
	 @Column(name="disponibilite",nullable = false)
	 private Boolean disponibilite;

	 
	 @OneToMany(mappedBy = "docteur",fetch = FetchType.LAZY)
	 private Set<RendezVous> ListeRendezVous;


	public Docteur(String specialite, Boolean disponibilite, Set<RendezVous> listeRendezVous) {
		super();
		this.specialite = specialite;
		this.disponibilite = disponibilite;
		ListeRendezVous = listeRendezVous;
	}


	public Docteur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Docteur(Long id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public Boolean getDisponibilite() {
		return disponibilite;
	}


	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}


	public Set<RendezVous> getListeRendezVous() {
		return ListeRendezVous;
	}


	public void setListeRendezVous(Set<RendezVous> listeRendezVous) {
		ListeRendezVous = listeRendezVous;
	}


	@Override
	public String toString() {
		return "Docteur [specialite=" + specialite + ", disponibilite=" + disponibilite + ", ListeRendezVous="
				+ ListeRendezVous + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", getSpecialite()="
				+ getSpecialite() + ", getDisponibilite()=" + getDisponibilite() + ", getListeRendezVous()="
				+ getListeRendezVous() + ", getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ListeRendezVous, disponibilite, specialite);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docteur other = (Docteur) obj;
		return Objects.equals(ListeRendezVous, other.ListeRendezVous)
				&& Objects.equals(disponibilite, other.disponibilite) && Objects.equals(specialite, other.specialite);
	}
	 
	 
}
