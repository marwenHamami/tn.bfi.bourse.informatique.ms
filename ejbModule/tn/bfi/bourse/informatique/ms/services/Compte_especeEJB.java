package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



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

}
