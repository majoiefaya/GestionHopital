package com.gestionHopital.gestionHopital.Models;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Patient")
@DiscriminatorColumn(name="PatientType")
public class Patient extends Personne{

	 @Column(name="age",nullable = false)
	 private int age;
	 
	 @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY)
	 private Set<RendezVous> ListeRendezVous;

	public Patient(int age, Set<RendezVous> listeRendezVous) {
		super();
		this.age = age;
		ListeRendezVous = listeRendezVous;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<RendezVous> getListeRendezVous() {
		return ListeRendezVous;
	}

	public void setListeRendezVous(Set<RendezVous> listeRendezVous) {
		ListeRendezVous = listeRendezVous;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ListeRendezVous, age);
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
		Patient other = (Patient) obj;
		return Objects.equals(ListeRendezVous, other.ListeRendezVous) && age == other.age;
	}
	
	 
}
