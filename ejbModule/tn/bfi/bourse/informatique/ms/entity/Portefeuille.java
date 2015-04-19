package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Portefeuille
 *
 */
@Entity
public class Portefeuille implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String libelle;
	private String code;
	private double capital;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Compte_espece compte_espece = new Compte_espece();
	@ManyToOne
	private Compte_br compte_br;
	private static final long serialVersionUID = 1L;

	public Portefeuille() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public Compte_espece getCompte_espece() {
		return compte_espece;
	}

	public void setCompte_espece(Compte_espece compte_espece) {
		this.compte_espece = compte_espece;
	}

	public Compte_br getCompte_br() {
		return compte_br;
	}

	public void setCompte_br(Compte_br compte_br) {
		this.compte_br = compte_br;
	}

}
