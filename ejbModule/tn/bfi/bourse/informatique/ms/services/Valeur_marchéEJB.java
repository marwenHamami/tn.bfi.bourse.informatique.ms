package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Valeur_march�;
import tn.bfi.bourse.informatique.ms.local.Valeur_march�EJBLocal;
import tn.bfi.bourse.informatique.ms.remote.Valeur_march�EJBRemote;

/**
 * Session Bean implementation class Valeur_march�EJB
 */
@Stateless
@LocalBean
public class Valeur_march�EJB implements Valeur_march�EJBRemote,
		Valeur_march�EJBLocal {

	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Valeur_march�EJB() {
		// TODO Auto-generated constructor stub
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Valeur_march� findById(int id) {
		try {
			return entityManager.find(Valeur_march�.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void add(Valeur_march� valeur_march�) {
		entityManager.persist(valeur_march�);

	}

	@Override
	public List<Valeur_march�> findAll() {
		return entityManager.createQuery("SELECT v FROM Valeur_march� v",
				Valeur_march�.class).getResultList();
	}

}
