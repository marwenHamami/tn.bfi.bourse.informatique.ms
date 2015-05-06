package tn.bfi.bourse.informatique.ms.local;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Valeur_marché;

@Local
public interface Valeur_marchéEJBLocal {
	
	void add(Valeur_marché valeur_marché);
	public Valeur_marché findById(int id);
}
