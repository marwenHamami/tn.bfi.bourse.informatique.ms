package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ListeValeurMarche
 *
 */
@Entity
@IdClass(ListeValeurMarchePK.class)
public class ListeValeurMarche implements Serializable {

	@Id
	private int id_valeurMarche;
	@Id
	private int id_liste;
	@ManyToOne
	private Liste liste = new Liste();
	@ManyToOne
	private Valeur_marché valeur_marché = new Valeur_marché();
	private static final long serialVersionUID = 1L;

	public ListeValeurMarche(Liste liste, Valeur_marché valeur_marché) {
		super();
		this.id_liste = liste.getId();
		this.id_valeurMarche = valeur_marché.getId();
		this.liste = liste;
		this.valeur_marché = valeur_marché;
	}

	public ListeValeurMarche() {
		super();
	}

	public int getId_valeurMarche() {
		return this.id_valeurMarche;
	}

	public void setId_valeurMarche(int id_valeurMarche) {
		this.id_valeurMarche = id_valeurMarche;
	}

	public int getId_liste() {
		return this.id_liste;
	}

	public void setId_liste(int id_liste) {
		this.id_liste = id_liste;
	}

	public Liste getListe() {
		return liste;
	}

	public void setListe(Liste liste) {
		this.liste = liste;
	}

	public Valeur_marché getValeur_marché() {
		return valeur_marché;
	}

	public void setValeur_marché(Valeur_marché valeur_marché) {
		this.valeur_marché = valeur_marché;
	}
	

}
