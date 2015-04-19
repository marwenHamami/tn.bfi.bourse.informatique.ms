package tn.bfi.bourse.informatique.ms.services;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	public void passerordre(int id, int quantité, Date date_saisi, String type) {

		
	}


	

}
