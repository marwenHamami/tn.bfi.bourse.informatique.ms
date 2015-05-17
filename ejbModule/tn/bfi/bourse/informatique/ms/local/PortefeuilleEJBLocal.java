package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Portefeuille;

@Local
public interface PortefeuilleEJBLocal {
	public List<Portefeuille> findProtefeuilleByClient(Client client);

	public void add(Portefeuille portefeuille);
	public void delete(Portefeuille portefeuille);
	
	public Portefeuille findById(int id);
}
