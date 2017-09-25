package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XProduct implements Serializable{
	private static final long serialVersionUID = 1L;

	int idp;
	int amount;
	int cost;
	XProductLexicon type;
	XOrder xorder;
	XDepot xdepot;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROD_SEQ_GEN")
	@SequenceGenerator(name="PROD_SEQ_GEN", sequenceName="PROD_SEQ", allocationSize=1)
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
	@ManyToOne(targetEntity=XProductLexicon.class,fetch=FetchType.EAGER)
	public XProductLexicon getType() {
		return type;
	}
	public void setType(XProductLexicon type) {
		this.type = type;
	}
	@ManyToOne(targetEntity=XOrder.class,fetch=FetchType.EAGER)
	public XOrder getXorder() {
		return xorder;
	}
	public void setXorder(XOrder xorder) {
		this.xorder = xorder;
	}
	@ManyToOne(targetEntity=XDepot.class,fetch=FetchType.EAGER)
	public XDepot getXdepot() {
		return xdepot;
	}
	public void setXdepot(XDepot xdepot) {
		this.xdepot = xdepot;
	}
	
	
}
