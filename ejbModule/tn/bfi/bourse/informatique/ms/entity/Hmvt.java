package tn.bfi.bourse.informatique.ms.entity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Hmvt
 *
 */
@Entity

public class Hmvt implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Date date;
	private Double montant;
	private String canal;
	@OneToMany(mappedBy = "hmvt", cascade = { CascadeType.MERGE })
	private List<Execution> executions = new ArrayList<Execution>();
	@ManyToOne
	private Portefeuille portfeuille;
	private static final long serialVersionUID = 1L;

	public Hmvt() {
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
	public Double getMontant() {
		return this.montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}   
	public String getCanal() {
		return this.canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}
	public List<Execution> getExecutions() {
		return executions;
	}
	public void setExecutions(List<Execution> executions) {
		this.executions = executions;
	}
	public Portefeuille getPortfeuille() {
		return portfeuille;
	}
	public void setPortfeuille(Portefeuille portfeuille) {
		this.portfeuille = portfeuille;
	}
   
}
