package pl.project.warehouse.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int ido;
	int totalCost;
	/*@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=false)
	List<XProduct> products = new ArrayList<XProduct>();*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@XmlAttribute
	public int getIdo() {
		return ido;
	}
	public void setIdo(int ido) {
		this.ido = ido;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	/*public List<XProduct> getProducts() {
		return products;
	}
	public void setProducts(List<XProduct> products) {
		this.products = products;
	}*/
	
	
}
