package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Execution;
import tn.bfi.bourse.informatique.ms.entity.Portefeuille;
import tn.bfi.bourse.informatique.ms.local.ExecutionEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.ExecutionEJBRemote;

/**
 * Session Bean implementation class ExecutionEJB
 */
@Stateless
@LocalBean
public class ExecutionEJB implements ExecutionEJBRemote, ExecutionEJBLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	public ExecutionEJB() {
		// TODO Auto-generated constructor stub
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Execution> findAll() {
		return entityManager.createQuery("SELECT e FROM Execution e",
				Execution.class).getResultList();
	}

	@Override
	public void add(Execution execution) {
		entityManager.persist(execution);
	}

	@Override
	public List<Execution> findByClient(Client client) {
		return entityManager
				.createQuery(
						"SELECT e FROM Execution e WHERE e.hmvt.portfeuille.client=:client",
						Execution.class).setParameter("client", client)
				.getResultList();
	}

	@Override
	public List<Execution> findByPortefeuil(Portefeuille portefeuille) {
		return entityManager
				.createQuery(
						"SELECT e FROM Execution e WHERE e.hmvt.portfeuille=:protefeuill",
						Execution.class)
				.setParameter("protefeuill", portefeuille).getResultList();
	}

}
