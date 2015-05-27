package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Liste;
import tn.bfi.bourse.informatique.ms.entity.Valeur_marché;

@Local
public interface ListeEJBLocal {

	public void addliste(Liste liste);

	public void deleteliste(Liste liste);

	public List<Liste> findAll();

	public void addvaleurlist(Liste valeur_marché);

	public void deletevaleurlist(Liste valeur_marché);

	public List<Valeur_marché> findAlll();
	
	public Liste findById(int id);
	
	public void update(Liste liste);
	
	public List<Liste> findByClient(Client client);
}
