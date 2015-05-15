package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Hmvt;
import tn.bfi.bourse.informatique.ms.local.HmvtEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.HmvtEJBRemote;

/**
 * Session Bean implementation class HmvtEJB
 */
@Stateless
@LocalBean
public class HmvtEJB implements HmvtEJBRemote, HmvtEJBLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	public HmvtEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Hmvt> findAll() {
		return entityManager.createQuery("SELECT h FROM Hmvt h", Hmvt.class)
				.getResultList();
	}

	@Override
	public void add(Hmvt hmvt) {
		entityManager.persist(hmvt);

	}

	@Override
	public List<Hmvt> findByClient(Client client) {
//		return entityManager
//				.createQuery(
//						"select h Hmvt h WHERE h.portfeuille.client=:client",
//						Hmvt.class).setParameter("client", client)
//				.getResultList();
		return null;
	}

}
