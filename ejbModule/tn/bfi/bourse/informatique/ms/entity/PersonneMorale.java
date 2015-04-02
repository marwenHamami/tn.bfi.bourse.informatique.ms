package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;
import tn.bfi.bourse.informatique.ms.entity.User;

/**
 * Entity implementation class for Entity: PersonneMorale
 *
 */
@Entity
public class PersonneMorale extends User implements Serializable {

	private Double capitale;
	private String fax;
	private String adresse;
	private String email;
	private int tel;
	private static final long serialVersionUID = 1L;

	public PersonneMorale() {
		super();
	}

	public Double getCapitale() {
		return this.capitale;
	}

	public void setCapitale(Double capitale) {
		this.capitale = capitale;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTel() {
		return this.tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

}
