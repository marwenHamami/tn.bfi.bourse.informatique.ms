package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;

/**
 * ID class for entity: ListeValeurMarche
 *
 */ 
public class ListeValeurMarchePK  implements Serializable {   
   
	         
	private int id_valeurMarche;         
	private int id_liste;
	private static final long serialVersionUID = 1L;

	public ListeValeurMarchePK() {}

	

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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof ListeValeurMarchePK)) {
			return false;
		}
		ListeValeurMarchePK other = (ListeValeurMarchePK) o;
		return true
			&& getId_valeurMarche() == other.getId_valeurMarche()
			&& getId_liste() == other.getId_liste();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId_valeurMarche();
		result = prime * result + getId_liste();
		return result;
	}
   
   
}
