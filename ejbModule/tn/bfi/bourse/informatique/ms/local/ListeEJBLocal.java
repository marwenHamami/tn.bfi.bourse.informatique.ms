package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Liste;
import tn.bfi.bourse.informatique.ms.entity.Valeur_march�;

@Local
public interface ListeEJBLocal {
	
	public void addliste(Liste liste);
	public void deleteliste(Liste liste);
	public List<Liste> findAll();
	public void addvaleurlist(Liste valeur_march�);
	public void deletevaleurlist(Liste valeur_march�);
	public List<Valeur_march�> findAlll();
	
}
