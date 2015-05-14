package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Liste
 *
 */
@Entity

public class Liste implements Serializable {

	   
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;
	private Date date_creation;
	private String libile;
	@OneToMany(mappedBy = "liste", cascade = { CascadeType.MERGE })
	private List<Valeur_marché> valeur_marchés = new ArrayList<Valeur_marché>();
	@ManyToOne
	private User user;
	private static final long serialVersionUID = 1L;

	public Liste() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate_creation() {
		return this.date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}   
	public String getLibile() {
		return this.libile;
	}

	public void setLibile(String libile) {
		this.libile = libile;
	}
	public List<Valeur_marché> getValeur_marchés() {
		return valeur_marchés;
	}
	public void setValeur_marchés(List<Valeur_marché> valeur_marchés) {
		this.valeur_marchés = valeur_marchés;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
   
}
