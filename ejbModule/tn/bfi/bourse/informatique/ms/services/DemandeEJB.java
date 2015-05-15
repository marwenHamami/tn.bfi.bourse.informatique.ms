package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Demande;
import tn.bfi.bourse.informatique.ms.local.DemandeEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.DemandeEJBRemote;

/**
 * Session Bean implementation class DemandeEJB
 */
@Stateless
@LocalBean
public class DemandeEJB implements DemandeEJBRemote, DemandeEJBLocal {

	
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;
	
    public DemandeEJB() {
        // TODO Auto-generated constructor stub
    }

    public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void update(Demande demande) {
		entityManager.merge(demande);

	}
	
	@Override
	public void delete(Demande demande) {
		entityManager.remove(entityManager.merge(demande));
	}
	
	@Override
	public List<Demande> findAll() {
		return entityManager
				.createQuery("SELECT d FROM Demande d", Demande.class)
				.getResultList();
	}

	@Override
	public void add(Demande demande) {
		entityManager.persist(demande);
	}

}
