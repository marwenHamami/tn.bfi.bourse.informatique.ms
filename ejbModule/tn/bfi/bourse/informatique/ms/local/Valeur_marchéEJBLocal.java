package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Valeur_march�;

@Local
public interface Valeur_march�EJBLocal {

	void add(Valeur_march� valeur_march�);

	public Valeur_march� findById(int id);

	public List<Valeur_march�> findAll();
}
