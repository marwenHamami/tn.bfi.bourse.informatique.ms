package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Valeur_marché;
import tn.bfi.bourse.informatique.ms.local.Valeur_marchéEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.Valeur_marchéEJBRemote;

/**
 * Session Bean implementation class Valeur_marchéEJB
 */
@Stateless
@LocalBean
public class Valeur_marchéEJB implements Valeur_marchéEJBRemote,
		Valeur_marchéEJBLocal {

	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Valeur_marchéEJB() {
		// TODO Auto-generated constructor stub
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Valeur_marché findById(int id) {
		try {
			return entityManager.find(Valeur_marché.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void add(Valeur_marché valeur_marché) {
		entityManager.persist(valeur_marché);

	}

	@Override
	public List<Valeur_marché> findAll() {
		return entityManager.createQuery("SELECT v FROM Valeur_marché v",
				Valeur_marché.class).getResultList();
	}

}
