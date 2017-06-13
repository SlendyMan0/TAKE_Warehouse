package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class XProduct implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	int amount;
	int cost;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=false)
	XProductLexicon type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public XProductLexicon getType() {
		return type;
	}
	public void setType(XProductLexicon type) {
		this.type = type;
	}
	
	
}
