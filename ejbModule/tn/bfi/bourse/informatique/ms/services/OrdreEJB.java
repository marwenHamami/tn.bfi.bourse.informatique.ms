package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Ordre;
import tn.bfi.bourse.informatique.ms.local.OrdreEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.OrdreEJBRemote;

/**
 * Session Bean implementation class OrdreEJB
 */
@Stateless
@LocalBean
public class OrdreEJB implements OrdreEJBRemote, OrdreEJBLocal {
	
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;
	
    public OrdreEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void passerordre(Ordre ordre) {
		entityManager.persist(ordre);
		
	}

	@Override
	public void modifierordre(Ordre ordre) {
		entityManager.merge(ordre);
		
	}

	@Override
	public void supprimerordre(Ordre ordre) {
		entityManager.remove(entityManager.merge(ordre));
		
	}

	@Override
	public List<Ordre> findAll() {
		return entityManager
				.createQuery("SELECT o FROM Ordre o", Ordre.class)
				.getResultList();
	}


	

}
