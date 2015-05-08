package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Valeur_marché
 *
 */
@Entity

public class Valeur_marché implements Serializable {

	   
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;
	private Long code_interne;
	private String lib_lon;
	private Double cours_ref;
	private Double dernier_cours;
	private Long code_isim;
	private Double qte;
	private Date date_dernier_cours;
	private Double variation;
	private String types;
	@OneToMany(mappedBy = "valeur_marché", cascade = { CascadeType.MERGE })
	private List<Ordre> ordres = new ArrayList<Ordre>();
	private static final long serialVersionUID = 1L;

	public Valeur_marché() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Long getCode_interne() {
		return this.code_interne;
	}

	public void setCode_interne(Long code_interne) {
		this.code_interne = code_interne;
	}   
	public String getLib_lon() {
		return this.lib_lon;
	}

	public void setLib_lon(String lib_lon) {
		this.lib_lon = lib_lon;
	}   
	public Double getCours_ref() {
		return this.cours_ref;
	}

	public void setCours_ref(Double cours_ref) {
		this.cours_ref = cours_ref;
	}   
	public Double getDernier_cours() {
		return this.dernier_cours;
	}

	public void setDernier_cours(Double dernier_cours) {
		this.dernier_cours = dernier_cours;
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
	public Long getCode_isim() {
		return code_isim;
	}
	public void setCode_isim(Long code_isim) {
		this.code_isim = code_isim;
	}
	public Double getQte() {
		return qte;
	}
	public void setQte(Double qte) {
		this.qte = qte;
	}
	public Date getDate_dernier_cours() {
		return date_dernier_cours;
	}
	public void setDate_dernier_cours(Date date_dernier_cours) {
		this.date_dernier_cours = date_dernier_cours;
	}
	public Double getVariation() {
		return variation;
	}
	public void setVariation(Double variation) {
		this.variation = variation;
	}
	
   
}
