package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Portefeuille;
import tn.bfi.bourse.informatique.ms.local.PortefeuilleEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.PortefeuilleEJBRemote;

/**
 * Session Bean implementation class PortefeuilleEJB
 */
@Singleton
@LocalBean
public class PortefeuilleEJB implements PortefeuilleEJBRemote,
		PortefeuilleEJBLocal {

	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PortefeuilleEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Portefeuille> findProtefeuilleByClient(Client client) {
		return entityManager
				.createQuery(
						"SELECT p FROM Portefeuille p WHERE client=:client",
						Portefeuille.class).setParameter("client", client)
				.getResultList();
	}

	@Override
	public void add(Portefeuille portefeuille) {
		entityManager.persist(portefeuille);
	}

	@Override
	public Portefeuille findById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Portefeuille.class, id);
	}

}
