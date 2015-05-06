package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ordre
 *
 */
@Entity

public class Ordre implements Serializable {

	   
	@Id
	private int id;
	private int qt_initial;
	private int qt_absolu;
	private String status;
	private String statut_annulation;
	private String canal_saisie;
	private String sens_op;
	private Double montant_brut;
	private Double montanat_net;
	private Double montant_frais;
	private Double cours_estime;
	private Date date_cours;
	private Date date_saisis;
	private Date date_validité;
	private String Statut_modif;
	@ManyToOne
	private Compte_br compte_br;
	@ManyToOne
	private Valeur_marché valeur_marché;
	private static final long serialVersionUID = 1L;

	public Ordre() {
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
	public int getQt_absolu() {
		return this.qt_absolu;
	}

	public void setQt_absolu(int qt_absolu) {
		this.qt_absolu = qt_absolu;
	}   
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}   
	public String getStatut_annulation() {
		return this.statut_annulation;
	}

	public void setStatut_annulation(String statut_annulation) {
		this.statut_annulation = statut_annulation;
	}   
	public String getCanal_saisie() {
		return this.canal_saisie;
	}

	public void setCanal_saisie(String canal_saisie) {
		this.canal_saisie = canal_saisie;
	}   
	public String getSens_op() {
		return this.sens_op;
	}

	public void setSens_op(String sens_op) {
		this.sens_op = sens_op;
	}   
	public Double getMontant_brut() {
		return this.montant_brut;
	}

	public void setMontant_brut(Double montant_brut) {
		this.montant_brut = montant_brut;
	}   
	public Double getMontanat_net() {
		return this.montanat_net;
	}

	public void setMontanat_net(Double montanat_net) {
		this.montanat_net = montanat_net;
	}   
	public Double getMontant_frais() {
		return this.montant_frais;
	}

	public void setMontant_frais(Double montant_frais) {
		this.montant_frais = montant_frais;
	}   
	public Double getCours_estime() {
		return this.cours_estime;
	}

	public void setCours_estime(Double cours_estime) {
		this.cours_estime = cours_estime;
	}   
	public Date getDate_cours() {
		return this.date_cours;
	}

	public void setDate_cours(Date date_cours) {
		this.date_cours = date_cours;
	}   
	public Date getDate_saisis() {
		return this.date_saisis;
	}

	public void setDate_saisis(Date date_saisis) {
		this.date_saisis = date_saisis;
	}   
	public Date getDate_validité() {
		return this.date_validité;
	}

	public void setDate_validité(Date date_validité) {
		this.date_validité = date_validité;
	}   
	public String getStatut_modif() {
		return this.Statut_modif;
	}

	public void setStatut_modif(String Statut_modif) {
		this.Statut_modif = Statut_modif;
	}
	public Compte_br getCompte_br() {
		return compte_br;
	}
	public void setCompte_br(Compte_br compte_br) {
		this.compte_br = compte_br;
	}
	public Valeur_marché getValeur_marché() {
		return valeur_marché;
	}
	public void setValeur_marché(Valeur_marché valeur_marché) {
		this.valeur_marché = valeur_marché;
	}
   
}
