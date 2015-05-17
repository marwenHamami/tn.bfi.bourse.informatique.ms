package tn.bfi.bourse.informatique.ms.local;

import java.util.List;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Liste;
import tn.bfi.bourse.informatique.ms.entity.ListeValeurMarche;

@Local
public interface ListeValeurMarcheEJBLocal {
	public void add(ListeValeurMarche listeValeurMarche);
	
	public List<ListeValeurMarche> findListByListe(Liste liste);

}
