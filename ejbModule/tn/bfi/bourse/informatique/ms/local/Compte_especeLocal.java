package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Compte_espece;

@Local
public interface Compte_especeLocal {
	public void add(Compte_espece compte_espece);

	public void update(Compte_espece compte_espece);

	public void delete(Compte_espece compte_espece);

	public List<Compte_espece> findByClient(Client client);

	public Compte_espece findByRib(Long rib);

	public Compte_espece findByClients(Client client);
}
