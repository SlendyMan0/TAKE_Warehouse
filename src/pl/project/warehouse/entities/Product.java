package pl.project.warehouse.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	int amount;
	int cost;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=false)
	ProductLexicon type;
	
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
	public ProductLexicon getType() {
		return type;
	}
	public void setType(ProductLexicon type) {
		this.type = type;
	}
	
	
}
