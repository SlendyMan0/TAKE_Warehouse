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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@XmlRootElement
public class XClient implements Serializable{
	private static final long serialVersionUID = 1L;

	int idc;
	String name;
	String surname;
	String companyName;
	List<XOrder> xorders = new ArrayList<XOrder>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@XmlAttribute
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@OneToMany(targetEntity=XOrder.class, mappedBy="client", cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=false)
	//@XmlTransient
	public List<XOrder> getXOrders() {
		return xorders;
	}
	public void setXOrders(List<XOrder> orders) {
		this.xorders = orders;
	}
}
