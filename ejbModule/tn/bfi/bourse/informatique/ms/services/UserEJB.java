package tn.bfi.bourse.informatique.ms.services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Compte_br;
import tn.bfi.bourse.informatique.ms.entity.User;
import tn.bfi.bourse.informatique.ms.local.Compte_brEJBLocal;
import tn.bfi.bourse.informatique.ms.local.Compte_especeLocal;
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
	@EJB
	Compte_brEJBLocal compte_brEJBLocal;

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
		client.setCompte_br(null);
		client.setCompte_especes(null);
		entityManager.persist(client);
		Compte_br compte_br = new Compte_br();
		compte_br.setPortefeuilles(null);
		compte_br.setUser(client);
		compte_br.setDate_val(null);
		compte_br.setActive(false);
		compte_br.setValorisation(0.0);
		compte_brEJBLocal.add(compte_br);
		client.setCompte_br(compte_br);
		entityManager.merge(client);
	}

	@Override
	public boolean verifLogin(String login) {
		Query query = entityManager.createQuery(
				"SELECT u FROM User u WHERE u.login=:login", User.class)
				.setParameter("login", login);
		try {
			User u = (User) query.getSingleResult();
			System.err.println(u.getLogin());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
