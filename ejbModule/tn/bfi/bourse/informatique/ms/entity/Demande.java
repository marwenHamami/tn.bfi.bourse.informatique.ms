package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Demande
 *
 */
@Entity

public class Demande implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private int qt_initial;
	private String statut;
	private String canal_saisie;
	private Double montant_brut;
	private Double montant_net;
	private Double montant_frais;
	private String types;
	@OneToMany(mappedBy = "demande")
	private List<Ordre> ordres = new ArrayList<Ordre>();
	
	private static final long serialVersionUID = 1L;

	public Demande() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getQt_initial() {
		return this.qt_initial;
	}

	public void setQt_initial(int qt_initial) {
		this.qt_initial = qt_initial;
	}   
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}   
	public String getCanal_saisie() {
		return this.canal_saisie;
	}

	public void setCanal_saisie(String canal_saisie) {
		this.canal_saisie = canal_saisie;
	}   
	public Double getMontant_brut() {
		return this.montant_brut;
	}

	public void setMontant_brut(Double montant_brut) {
		this.montant_brut = montant_brut;
	}   
	public Double getMontant_net() {
		return this.montant_net;
	}

	public void setMontant_net(Double montant_net) {
		this.montant_net = montant_net;
	}   
	public Double getMontant_frais() {
		return this.montant_frais;
	}

	public void setMontant_frais(Double montant_frais) {
		this.montant_frais = montant_frais;
	}
	public List<Ordre> getOrdres() {
		return ordres;
	}
	public void setOrdres(List<Ordre> ordres) {
		this.ordres = ordres;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
   
}
