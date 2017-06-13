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

@Entity
public class XDepot implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int id;
	String adress;
	int spaceAvalible;
	int spaceTaken;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=false)
	List<XProductLexicon> productList = new ArrayList<XProductLexicon>();
	
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
	public List<XProductLexicon> getProductList() {
		return productList;
	}
	public void setProductList(List<XProductLexicon> productList) {
		this.productList = productList;
	}
	
	
}
