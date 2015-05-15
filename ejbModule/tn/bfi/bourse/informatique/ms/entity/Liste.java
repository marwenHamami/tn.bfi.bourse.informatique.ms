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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Date date_creation;
	private String libile;
	@ManyToOne
	private User user;
	@OneToMany(mappedBy = "liste")
	private List<ListeValeurMarche> listeValeurMarches = new ArrayList<ListeValeurMarche>();
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ListeValeurMarche> getListeValeurMarches() {
		return listeValeurMarches;
	}

	public void setListeValeurMarches(List<ListeValeurMarche> listeValeurMarches) {
		this.listeValeurMarches = listeValeurMarches;
	}
	
	

}
