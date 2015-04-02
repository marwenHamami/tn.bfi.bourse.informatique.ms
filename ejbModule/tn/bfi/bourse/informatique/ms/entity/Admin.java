package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import javax.persistence.*;
import tn.bfi.bourse.informatique.ms.entity.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
public class Admin extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

}
