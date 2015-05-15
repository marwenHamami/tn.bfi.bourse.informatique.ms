package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Hmvt;

@Local
public interface HmvtEJBLocal {

	List<Hmvt> findAll();

	public void add(Hmvt hmvt);
	
	public List<Hmvt> findByClient(Client client);
}
