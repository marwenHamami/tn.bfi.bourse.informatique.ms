package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Execution;
import tn.bfi.bourse.informatique.ms.entity.Portefeuille;

@Local
public interface ExecutionEJBLocal {

	List<Execution> findAll();

	public void add(Execution execution);
	
	public List<Execution> findByClient(Client client);
	
	public List<Execution> findByPortefeuil(Portefeuille portefeuille);
}
