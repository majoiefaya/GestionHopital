package com.gestionHopital.gestionHopital.Models;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Calendrier")
public class Calendrier {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="jourRendezVous",nullable = false)
    private Date jourRendezVous;

    @Column(name="heureDebut",nullable = false)
    private Time heureDebut;
    
    @Column(name="heureFin",nullable = false)
    private Time heureFin;
    
	@OneToMany(mappedBy = "calendrier",fetch = FetchType.LAZY)
	private Set<RendezVous> ListeRendezVous;

	public Calendrier(Long id, Date jourRendezVous, Time heureDebut, Time heureFin, Set<RendezVous> listeRendezVous) {
		super();
		this.id = id;
		this.jourRendezVous = jourRendezVous;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		ListeRendezVous = listeRendezVous;
	}

	public Calendrier() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(ListeRendezVous, heureDebut, heureFin, id, jourRendezVous);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendrier other = (Calendrier) obj;
		return Objects.equals(ListeRendezVous, other.ListeRendezVous) && Objects.equals(heureDebut, other.heureDebut)
				&& Objects.equals(heureFin, other.heureFin) && Objects.equals(id, other.id)
				&& Objects.equals(jourRendezVous, other.jourRendezVous);
	}

	@Override
	public String toString() {
		return "Calendrier [id=" + id + ", jourRendezVous=" + jourRendezVous + ", heureDebut=" + heureDebut
				+ ", heureFin=" + heureFin + ", ListeRendezVous=" + ListeRendezVous + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getJourRendezVous() {
		return jourRendezVous;
	}

	public void setJourRendezVous(Date jourRendezVous) {
		this.jourRendezVous = jourRendezVous;
	}

	public Time getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Time getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}

	public Set<RendezVous> getListeRendezVous() {
		return ListeRendezVous;
	}

	public void setListeRendezVous(Set<RendezVous> listeRendezVous) {
		ListeRendezVous = listeRendezVous;
	}
	
	


}
