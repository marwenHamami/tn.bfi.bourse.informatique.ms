package tn.bfi.bourse.informatique.ms.services;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Portefeuille;
import tn.bfi.bourse.informatique.ms.entity.User;
import tn.bfi.bourse.informatique.ms.local.UserEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.UserEJBRemote;

/**
 * Session Bean implementation class UserEJB
 */
@Singleton
@LocalBean
public class UserEJB implements UserEJBRemote, UserEJBLocal {

	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	public UserEJB() {

	}

	@Override
	public User authentification(String login, String mdp) {
		Query query;
		query = entityManager
				.createQuery(
						"SELECT u FROM User u WHERE u.login = :login AND u.password = :mdp",
						User.class).setParameter("login", login)
				.setParameter("mdp", mdp);

		try {
			return (User) query.getSingleResult();
		} catch (Exception e) {
			System.err.println("user not found " + e.getMessage());
			return null;
		}

	}

	@Override
	public void registrationClient(Client client) {
		Portefeuille portefeuille = new Portefeuille();
		portefeuille.setClient(client);
		client.addPortefeuille(portefeuille);
		entityManager.persist(client);
		entityManager.persist(portefeuille);
	}

}
