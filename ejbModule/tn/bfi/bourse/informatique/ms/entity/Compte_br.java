package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Compte_br
 *
 */
@Entity
public class Compte_br implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Double valorisation;
	private Date date_val;
	private boolean active;
	@OneToMany(mappedBy = "compte_br")
	private List<Portefeuille> portefeuilles = new ArrayList<Portefeuille>();
	@OneToOne(fetch=FetchType.LAZY,mappedBy="compte_br")
	private User user;
	@OneToMany(mappedBy="compte_br")
	private List<Ordre> ordres = new ArrayList<Ordre>();
	private static final long serialVersionUID = 1L;

	public Compte_br() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getValorisation() {
		return this.valorisation;
	}

	public void setValorisation(Double valorisation) {
		this.valorisation = valorisation;
	}

	public Date getDate_val() {
		return this.date_val;
	}

	public void setDate_val(Date date_val) {
		this.date_val = date_val;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Ordre> getOrdres() {
		return ordres;
	}

	public void setOrdres(List<Ordre> ordres) {
		this.ordres = ordres;
	}
	
}
