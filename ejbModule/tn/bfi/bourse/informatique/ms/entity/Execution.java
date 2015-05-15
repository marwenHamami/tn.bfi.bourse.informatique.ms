package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Execution
 *
 */
@Entity

public class Execution implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private Date date;
	private int quantity;
	private Double cours;
	private Double montant_net;
	private Double montant_brut;
	@ManyToOne
	private Ordre ordre;
	@ManyToOne
	private Hmvt hmvt;
	
	private static final long serialVersionUID = 1L;

	public Execution() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public Double getCours() {
		return this.cours;
	}

	public void setCours(Double cours) {
		this.cours = cours;
	}   
	public Double getMontant_net() {
		return this.montant_net;
	}

	public void setMontant_net(Double montant_net) {
		this.montant_net = montant_net;
	}   
	public Double getMontant_brut() {
		return this.montant_brut;
	}

	public void setMontant_brut(Double montant_brut) {
		this.montant_brut = montant_brut;
	}
	public Ordre getOrdre() {
		return ordre;
	}
	public void setOrdre(Ordre ordre) {
		this.ordre = ordre;
	}
	public Hmvt getHmvt() {
		return hmvt;
	}
	public void setHmvt(Hmvt hmvt) {
		this.hmvt = hmvt;
	}
   
}
