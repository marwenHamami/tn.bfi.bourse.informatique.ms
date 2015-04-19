package tn.bfi.bourse.informatique.ms.local;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface OrdreEJBLocal {
	
	public void passerordre(int id, int quantité, Date date_saisi, String type );

}
