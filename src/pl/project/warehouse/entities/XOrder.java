package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int ido;
	int totalCost;
	//List<XProduct> products = new ArrayList<XProduct>();
	XClient client;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORD_SEQ_GEN")
	@SequenceGenerator(name="ORD_SEQ_GEN", sequenceName="ORD_SEQ", allocationSize=1)
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
//	@OneToMany(targetEntity=XProduct.class, mappedBy="xorder", cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=false)
//	@XmlTransient
//	public List<XProduct> getProducts() {
//		return products;
//	}
//	public void setProducts(List<XProduct> products) {
//		this.products = products;
//	}
	@ManyToOne(targetEntity=XClient.class, fetch=FetchType.EAGER)
	public XClient getClient() {
		return client;
	}
	public void setClient(XClient client) {
		this.client = client;
	}
}
