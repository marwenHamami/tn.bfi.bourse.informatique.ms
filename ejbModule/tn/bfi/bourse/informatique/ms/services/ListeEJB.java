package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Liste;
import tn.bfi.bourse.informatique.ms.entity.Valeur_march�;
import tn.bfi.bourse.informatique.ms.local.ListeEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.ListeEJBRemote;

/**
 * Session Bean implementation class ListeEJB
 */
@Stateless
@LocalBean
public class ListeEJB implements ListeEJBRemote, ListeEJBLocal {


	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;
	
    public ListeEJB() {
        // TODO Auto-generated constructor stub
    }

    public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
    
	@Override
	public void addliste(Liste liste) {
		entityManager.persist(liste);
		
	}

	@Override
	public void deleteliste(Liste liste) {
		entityManager.remove(entityManager.merge(liste));
		
	}

	@Override
	public List<Liste> findAll() {
		return entityManager
				.createQuery("SELECT l FROM Liste l", Liste.class)
				.getResultList();
		
	}


	@Override
	public List<Valeur_march�> findAlll() {
		return entityManager
				.createQuery("SELECT v FROM Valeur_march� v", Valeur_march�.class)
				.getResultList();
	}

	@Override
	public void addvaleurlist(Liste valeur_march�) {
		entityManager.persist(valeur_march�);
		
	}

	@Override
	public void deletevaleurlist(Liste valeur_march�) {
		entityManager.remove(entityManager.merge(valeur_march�));
	}

	@Override
	public Liste findById(int id) {
		return entityManager.find(Liste.class, id);
	}

	@Override
	public void update(Liste liste) {
		entityManager.merge(liste);
	}

}
