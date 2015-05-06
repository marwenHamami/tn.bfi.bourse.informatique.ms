package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Client;
import tn.bfi.bourse.informatique.ms.entity.Compte_br;
import tn.bfi.bourse.informatique.ms.entity.User;
import tn.bfi.bourse.informatique.ms.local.AdminEJBLocal;
import tn.bfi.bourse.informatique.ms.local.Compte_brEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.AdminEJBRemote;

/**
 * Session Bean implementation class AdminEJB
 */
@Stateless
@LocalBean
public class AdminEJB implements AdminEJBRemote, AdminEJBLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;
	@EJB
	Compte_brEJBLocal compte_brEJBLocal;
	
    public AdminEJB() {
    	
    }

	@Override
	public void activeruser(User user) {
		
		user.setCompte_br();
		user.getCompte_especes();
		entityManager.persist(user);
		Compte_br compte_br = new Compte_br();
		compte_br.getPortefeuilles();
		compte_br.setUser(user);
		compte_br.getDate_val();
		compte_br.setActive(true);
		compte_br.setValorisation(0.0);
		compte_brEJBLocal.add(compte_br);
		user.setCompte_br(compte_br);
		entityManager.merge(user);
		
	}

	@Override
	public List<Client> findUserByAdmin(Client client) {
				return entityManager
					.createQuery(
							"SELECT u FROM Client c WHERE client=:client",
							Client.class).setParameter("client", client)
					.getResultList();

	}
    
    
    

}
