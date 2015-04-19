package tn.bfi.bourse.informatique.ms.local;

import javax.ejb.Local;

import tn.bfi.bourse.informatique.ms.entity.Compte_br;

@Local
public interface Compte_brEJBLocal {
	public void add(Compte_br compte_br);
}
