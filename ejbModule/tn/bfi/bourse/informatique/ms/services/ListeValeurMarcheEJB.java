package tn.bfi.bourse.informatique.ms.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bfi.bourse.informatique.ms.entity.Liste;
import tn.bfi.bourse.informatique.ms.entity.ListeValeurMarche;
import tn.bfi.bourse.informatique.ms.local.ListeValeurMarcheEJBLocal;
import tn.bfi.bourse.informatique.ms.remote.ListeValeurMarcheEJBRemote;

/**
 * Session Bean implementation class ListeValeurMarcheEJB
 */
@Stateless
@LocalBean
public class ListeValeurMarcheEJB implements ListeValeurMarcheEJBRemote,
		ListeValeurMarcheEJBLocal {
	@PersistenceContext(name = "tn.bfi.bourse.informatique.ms")
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ListeValeurMarcheEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ListeValeurMarche listeValeurMarche) {
		entityManager.persist(listeValeurMarche);

	}

	@Override
	public List<ListeValeurMarche> findListByListe(Liste liste) {
		return entityManager
				.createQuery(
						"SELECT l FROM ListeValeurMarche l WHERE l.liste=:liste",
						ListeValeurMarche.class).setParameter("liste", liste)
				.getResultList();
	}

}
