package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Compte_espece;
import tn.bfi.bourse.informatique.ms.local.Compte_especeLocal;
import tn.bfi.bourse.informatique.ms.remote.Compte_especeRemote;

/**
 * Session Bean implementation class Compte_especeEJB
 */
@Singleton
@LocalBean
public class Compte_especeEJB implements Compte_especeRemote,
		Compte_especeLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Compte_especeEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Compte_espece compte_espece) {
		entityManager.persist(compte_espece);
	}

	@Override
	public void update(Compte_espece compte_espece) {
		entityManager.merge(compte_espece);

	}

	@Override
	public void delete(Compte_espece compte_espece) {
		entityManager.remove(entityManager.merge(compte_espece));
	}

	@Override
	public List<Compte_espece> findByClient(Client client) {
		return entityManager
				.createQuery(
						"SELECT ce FROM Compte_espece ce WHERE ce.user=:user",
						Compte_espece.class).setParameter("user", client)
				.getResultList();
	}

	@Override
	public Compte_espece findByRib(Long rib) {
		Query query = entityManager.createQuery(
				"SELECT c FROM Compte_espece c WHERE c.RIB=:rib",
				Compte_espece.class).setParameter("rib", rib);
		try {
			return (Compte_espece) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Compte_espece findByClients(Client client) {
		Query query = entityManager.createQuery(
				"SELECT c FROM Compte_espece c WHERE c.user=:user",
				Compte_espece.class).setParameter("user", client);
		try {
			return (Compte_espece) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

}
