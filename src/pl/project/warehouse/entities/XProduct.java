package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XProduct implements Serializable{
	private static final long serialVersionUID = 1L;

	int idp;
	int amount;
	int cost;
	//XProductLexicon type;
	//XOrder xorder;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@XmlAttribute
	public int getIdp() {
		return idp;
	}
	public void setIdp(int idp) {
		this.idp = idp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=false)
//	public XProductLexicon getType() {
//		return type;
//	}
//	public void setType(XProductLexicon type) {
//		this.type = type;
//	}
	
	
}
