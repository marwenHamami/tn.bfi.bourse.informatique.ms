package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String login;
	private String password;
	@OneToMany(mappedBy = "user", cascade = { CascadeType.MERGE })
	private List<Compte_espece> compte_especes = new ArrayList<Compte_espece>();
	@OneToOne(fetch=FetchType.LAZY)
	private Compte_br compte_br = new Compte_br();
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Compte_espece> getCompte_especes() {
		return compte_especes;
	}

	public void setCompte_especes(List<Compte_espece> compte_especes) {
		this.compte_especes = compte_especes;
	}

	public Compte_br getCompte_br() {
		return compte_br;
	}

	public void setCompte_br(Compte_br compte_br) {
		this.compte_br = compte_br;
	}

	public void setCompte_br() {
		// TODO Auto-generated method stub
		
	}

}
