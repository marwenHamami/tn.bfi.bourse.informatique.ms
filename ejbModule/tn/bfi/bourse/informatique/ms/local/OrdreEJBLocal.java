package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Ordre;

@Local
public interface OrdreEJBLocal {
	
	public void passerordre(Ordre ordre);
	public void modifierordre(Ordre ordre);
	public void supprimerordre(Ordre ordre);
	public List<Ordre> findAll();

}
