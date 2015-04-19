package tn.bfi.bourse.informatique.ms.local;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.User;

@Local
public interface UserEJBLocal {
	public User authentification(String login, String mdp);

	public void registrationClient(Client client);
	
	public boolean verifLogin(String login);
}
