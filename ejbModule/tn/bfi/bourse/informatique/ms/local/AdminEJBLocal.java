package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.User;

@Local
public interface AdminEJBLocal {
	
	public List<Client> findUserByAdmin(Client client);

	public void activeruser(User user);

}
