package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Demande;

@Local
public interface DemandeEJBLocal {

	void update(Demande demande);

	void delete(Demande demande);

	List<Demande> findAll();
	
	public void add(Demande demande);

}
