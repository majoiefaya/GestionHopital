package com.gestionHopital.gestionHopital.Models;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="PersonneType")
@Table(name = "Personne")
public class Personne {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom",nullable = false)
    protected String nom;

    @Column(name="prenom",nullable = false)
    protected String prenom;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(id, other.id) && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}
    
    
}
