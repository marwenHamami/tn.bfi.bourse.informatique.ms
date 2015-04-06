package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.bfi.bourse.informatique.ms.entity.User;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client extends User implements Serializable {
	private int cin;
	private String email;
	private int tel;
	private String adresse;
	private String nom;
	private String prenom;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return this.tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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

}
