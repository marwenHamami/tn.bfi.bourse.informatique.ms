package tn.bfi.bourse.informatique.ms.services;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Compte_br;
import tn.bfi.bourse.informatique.ms.local.Compte_brEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.Compte_brEJBRemote;

/**
 * Session Bean implementation class Compte_brEJB
 */
@Singleton
@LocalBean
public class Compte_brEJB implements Compte_brEJBRemote, Compte_brEJBLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Compte_brEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Compte_br compte_br) {
		entityManager.persist(compte_br);
	}

}
