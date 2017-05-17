package pl.project.warehouse.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Depot {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	String adress;
	int spaceAvalible;
	int spaceTaken;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=false)
	List<ProductLexicon> productList = new ArrayList<ProductLexicon>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getSpaceAvalible() {
		return spaceAvalible;
	}
	public void setSpaceAvalible(int spaceAvalible) {
		this.spaceAvalible = spaceAvalible;
	}
	public int getSpaceTaken() {
		return spaceTaken;
	}
	public void setSpaceTaken(int spaceTaken) {
		this.spaceTaken = spaceTaken;
	}
	public List<ProductLexicon> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductLexicon> productList) {
		this.productList = productList;
	}
	
	
}
