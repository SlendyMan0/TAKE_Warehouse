package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XDepot implements Serializable{
	private static final long serialVersionUID = 1L;

	int idd;
	String adress;
	int spaceAvalible;
	int spaceTaken;
	//List<XProductLexicon> productList = new ArrayList<XProductLexicon>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPO_SEQ_GEN")
	@SequenceGenerator(name="DEPO_SEQ_GEN", sequenceName="DEPO_SEQ", allocationSize=1)
	@XmlAttribute
	public int getIdd() {
		return idd;
	}
	public void setIdd(int idd) {
		this.idd = idd;
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
//	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=false)
//	@XmlTransient
//	public List<XProductLexicon> getProductList() {
//		return productList;
//	}
//	public void setProductList(List<XProductLexicon> productList) {
//		this.productList = productList;
//	}
	
	
}
