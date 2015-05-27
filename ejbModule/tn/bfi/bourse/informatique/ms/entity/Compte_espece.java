package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Compte_espece
 *
 */
@Entity
public class Compte_espece implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Long RIB;
	private String lib;
	private Double solde;
	@ManyToOne
	@JoinColumn(nullable=true)
	private User user = new User();

	@OneToMany(mappedBy = "compte_espece", cascade = { CascadeType.MERGE })
	private List<Portefeuille> portefeuilles = new ArrayList<Portefeuille>();

	private static final long serialVersionUID = 1L;

	public Compte_espece() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getRIB() {
		return this.RIB;
	}

	public void setRIB(Long RIB) {
		this.RIB = RIB;
	}

	public String getLib() {
		return this.lib;
	}

	public void setLib(String lib) {
		this.lib = lib;
	}

	public Double getSolde() {
		return this.solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public List<Portefeuille> getPortefeuilles() {
		return portefeuilles;
	}

	public void setPortefeuilles(List<Portefeuille> portefeuilles) {
		this.portefeuilles = portefeuilles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
